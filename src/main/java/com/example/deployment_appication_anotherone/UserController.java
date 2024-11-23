package com.example.deployment_appication_anotherone;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

Map<String, String> users = new HashMap<>();
    @GetMapping
    public String HelloWorld(){
        return "Hello freddie";}

    public void buildUsers(){
        users.put("fareed", "olamide");
        users.put("baby", "boi");
    }

    @GetMapping("goods")
    public Map<String, String> good(){
        buildUsers();
        return users;
    }

}


