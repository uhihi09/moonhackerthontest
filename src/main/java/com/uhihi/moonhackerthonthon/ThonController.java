package com.uhihi.moonhackerthonthon;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/thon")
public class ThonController {
    @PostMapping
    public String receive(@RequestBody Map<String, Object> data) {
        System.out.println("data: " + data);
        return "data received";
    }

    @GetMapping
    public String hello() {
        return "server connect success";
    }
}
