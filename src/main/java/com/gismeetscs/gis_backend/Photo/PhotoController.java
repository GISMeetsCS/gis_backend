package com.gismeetscs.gis_backend.Photo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
    
}
