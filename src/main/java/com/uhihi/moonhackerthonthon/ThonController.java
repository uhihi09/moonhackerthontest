package com.uhihi.moonhackerthonthon;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/thon")
public class ThonController {
    @PostMapping
    public String receive(@RequestBody Map<String, Object> data) {
        System.out.println("data: " + data);
        return "데이터 리시브";
    }

    @GetMapping
    public String hello() {
        return "서버 연결 성공";
    }
}
