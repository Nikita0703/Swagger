package com.example.swagger.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AdditionService {
    public int add(int first, int second) {
        log.info("Welcome to the log");
        return first + second;
    }
}