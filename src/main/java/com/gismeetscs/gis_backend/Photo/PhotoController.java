package com.gismeetscs.gis_backend.Photo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import io.swagger.annotations.Api;

@Api(tags="Photo")
@RestController
@RequestMapping(value = "photos")
public class PhotoController {

    @Autowired
    PhotoService photoService;

    @PostMapping
    public boolean upload(@RequestParam("memberId") int memberId,@RequestParam("lat") double lat, @RequestParam("lon") double lon, @RequestParam("file") MultipartFile file) throws IOException{
        Photo photo = new Photo();
        photo.setLatitude(lat);
        photo.setLongitude(lon);
        photo.setMemberId(memberId);
        return photoService.upload(photo, file);
    }

    @GetMapping("/{photoId}")
    public ResponseEntity<?> downloadImage(@PathVariable("photoId") int photoId) {
        byte[] downloadImage = photoService.downloadImage(photoId);
        return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.valueOf("image/png"))
                .body(downloadImage);
    }

    @GetMapping("/locInfo/{lat}/{lng}")
    public Photo find(@PathVariable("lat")double lat, @PathVariable("lng")double lng){
        Photo photo = photoService.getLocInfo(lat, lng);
        return photo;
    }
    
    @GetMapping("/location/list")
    public List<Location> getAllLocation(){
        List<Location> locations = new ArrayList<>();
        List<Photo> photos = photoService.getAll();
        for(Photo photo : photos)
            locations.add(new Location(photo.getLatitude(), photo.getLongitude()));
        return locations;
    }
}
