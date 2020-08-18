package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Hi This is bishnu kashyap here, hackathon No. 4 CI-CD using jenkins pipeline \n";
    }
    
}
