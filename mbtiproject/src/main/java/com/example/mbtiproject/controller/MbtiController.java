package com.example.mbtiproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MbtiController {
    @GetMapping("/api/v1/mbti-test")
    public String mbti1(){
        return "내 성격 유형검사하고 나와 맞는 모임을 찾아보세요";
    }
}
