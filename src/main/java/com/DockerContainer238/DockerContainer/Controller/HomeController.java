package com.DockerContainer238.DockerContainer.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class HomeController {

    @GetMapping

    public String getHomePageMessage(){
        return "Welcome Home!";
    }
}
