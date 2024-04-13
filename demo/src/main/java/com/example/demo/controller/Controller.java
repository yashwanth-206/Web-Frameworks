package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.response.Response;
 

@RestController
public class Controller {
    @Value("${myname.name}")
    private String name;
   // @GetMapping("/welcome")
    ////public //Response welcome()
    {
        //Response obj=new Response(2, "Yashwanth","Saravanan");
        //return obj;
    }

}
