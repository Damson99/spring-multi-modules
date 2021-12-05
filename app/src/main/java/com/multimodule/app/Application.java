package com.multimodule.app;

import com.multimodule.lib.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@SpringBootApplication(scanBasePackages = "com.multimodule")
//@EnableJpaRepositories
//@EntityScan
public class Application {

    private final MessageService messageService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/")
    public String home() {
        return messageService.message();
    }
}
