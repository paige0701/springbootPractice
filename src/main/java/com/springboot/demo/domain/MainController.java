package com.springboot.demo.domain;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Paige on 3/4/18.
 */
@RestController
public class MainController {

    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }

    @RequestMapping("/fruits")
    public Fruit getFruit() {
        return new Fruit("Mango", 3, "Vietnam", 50, "Yellow");
    }

}
