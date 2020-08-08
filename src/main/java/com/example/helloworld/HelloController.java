package com.example.helloworld;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {

    @GetMapping
    public ResponseEntity<HashMap<String, String>> greet(){
        HashMap<String, String> map = new HashMap<>();
        map.put("message", "Hello world!");
        return ResponseEntity.ok(map);
    }
}
