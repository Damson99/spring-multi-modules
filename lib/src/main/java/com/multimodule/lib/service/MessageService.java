package com.multimodule.lib.service;


import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(PropertiesService.class)
@RequiredArgsConstructor
public class MessageService {

    private final PropertiesService propertiesService;


    public String message() {
        return this.propertiesService.getMessage();
    }
}

