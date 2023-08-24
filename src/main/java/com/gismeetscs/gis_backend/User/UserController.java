package com.gismeetscs.gis_backend.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;


@Api(tags="User")
@RestController
@RequestMapping(value = "user")
public class UserController {
 
    @Autowired
    UserRepository userRepository;

    @PostMapping(value = "create")
    public boolean create(User user){
        userRepository.save(user);
        return true;
    }

}
