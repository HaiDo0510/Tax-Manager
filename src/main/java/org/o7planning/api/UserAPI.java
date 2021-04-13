package org.o7planning.api;


import org.o7planning.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
public class UserAPI {

    @Autowired
    private IUserService userService;

    @PostMapping(value = "/login-user")
    public String checkUser(@PathVariable("email") String email, @PathVariable("password") String password){
        Boolean temp = userService.checkUser(email, password);
        if(temp){
            return "redirect:test";
        } else{
            return "redirect:index";
        }
    }
}
