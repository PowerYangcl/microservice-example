package com.matrix.springcloud.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matrix.springcloud.service.IMessageProviderService;

import javax.annotation.Resource;


@RestController
public class SendMessageController {
    @Resource
    private IMessageProviderService messageProviderService;

    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        return messageProviderService.send();
    }

}

