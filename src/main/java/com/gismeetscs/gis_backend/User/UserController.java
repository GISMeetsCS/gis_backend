package com.gismeetscs.gis_backend.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
 
    @Autowired
    UserRepository userRepository;

    @PostMapping(value = "create")
    public boolean create(User user){
        userRepository.save(user);
        return true;
    }

}
