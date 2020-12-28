package com.hazelcast.test.rest;

import com.hazelcast.core.HazelcastInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class HazelcastController {

    @Autowired
    private HazelcastInstance hazelcastInstance;

    @GetMapping("/v1/getValue")
    public ResponseEntity getValue(@RequestParam(value = "name", defaultValue = "World") String key) {
        return ResponseEntity.of(Optional.of(hazelcastInstance.getMap("testMap").get(key)));
    }

    @PostMapping("/v1/setValue")
    public ResponseEntity setValue(@RequestParam String key, @RequestParam String value) {
        hazelcastInstance.getMap("testMap").set(key, value);
        return ResponseEntity.of(Optional.of(String.format("Key: %s and Value: %s set successfully ..", key, value)));
    }

}
