package io.bartnowakdev.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class GreetingsController {

    @GetMapping("/greetings/{name}")
    public ResponseEntity<String> hello(@PathVariable(name = "name") String name) {
        return ResponseEntity.ok("Hello " + name);
    }
}
