package io.bartnowakdev.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class GreetingsController {

    @GetMapping("/greetings")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World");
    }
}
