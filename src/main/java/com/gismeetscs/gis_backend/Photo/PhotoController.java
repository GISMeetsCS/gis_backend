package com.gismeetscs.gis_backend.Photo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api(tags="Photo")
@RestController
@RequestMapping(value = "photo")
public class PhotoController {

    @Autowired
    PhotoRepository photoRepository;

    @PostMapping(value = "upload")
    public boolean upload(Photo photo){
        photoRepository.save(photo);
        return true;
    }

    @GetMapping(value = "find")
    public Photo find(long photoId){
        Photo photo = photoRepository.findById(photoId).get();
        return photo;
    }

    @PutMapping(value = "modify")
    public boolean modify(Photo photo){
        photoRepository.save(photo);
        return true;
    }

    @DeleteMapping(value = "delete")
    public boolean delete(Photo photo){
        photoRepository.delete(photo);
        return true;
    }
    
}
