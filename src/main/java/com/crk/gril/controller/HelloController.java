package com.crk.gril.controller;

import com.crk.gril.properties.GrilPropertites;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


@RestController
@ RequestMapping(value = "/hello")
public class HelloController {
    @Autowired
    private GrilPropertites grilPropertites;
    @Value("${Content}")
    private String Content;
    @RequestMapping(value = "/sayHello/{id}",method = RequestMethod.GET)
    public int sayHello(@PathVariable("id") int id){
        return id;
    }
//    @RequestMapping(value = "/sayHi",method = RequestMethod.GET)
    @GetMapping("/sayHi")
    public int sayHi(@RequestParam(value = "id",required = false,defaultValue = "0") int myid){
        return myid;
    }
}
