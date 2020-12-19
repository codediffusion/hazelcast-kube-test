package com.hazelcast.test.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class HazelcastController {

    @GetMapping("/v1/getValue")
    public ResponseEntity getValue(@RequestParam(value = "name", defaultValue = "World") String name) {
        return ResponseEntity.of(Optional.of("Hello, " + name));
    }

    @PostMapping("/v1/setValue")
    public ResponseEntity setValue(@RequestParam String value) {
        return ResponseEntity.of(Optional.of(value));
    }

}
