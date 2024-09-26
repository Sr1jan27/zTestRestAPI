package com.srijan.ztestRestApi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class firstRestController {

//    @Autowired
//    FirstRestService firstRestService;


    @GetMapping("/print-name")
    public String printName(){
        return "Pandey";
    }
}
