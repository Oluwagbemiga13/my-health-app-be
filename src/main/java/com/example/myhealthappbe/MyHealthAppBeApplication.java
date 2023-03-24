package com.example.myhealthappbe;

import com.example.myhealthappbe.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
@RequiredArgsConstructor
public class MyHealthAppBeApplication {

    @Autowired
    private TestService testService;

    public static void main(String[] args) {
        SpringApplication.run(MyHealthAppBeApplication.class, args);

    }

}
