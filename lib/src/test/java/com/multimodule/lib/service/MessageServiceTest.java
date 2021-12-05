package com.multimodule.lib.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest("service.message=Hello")
class MessageServiceTest {

    @Autowired
    private MessageService messageService;

    @Test
    public void contextLoads() {
        assertThat(messageService.message()).isNotNull();
    }

    @SpringBootApplication
    static class TestConfiguration {
    }
}