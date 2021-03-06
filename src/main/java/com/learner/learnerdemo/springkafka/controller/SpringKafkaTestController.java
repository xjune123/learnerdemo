package com.learner.learnerdemo.springkafka.controller;

import com.learner.learnerdemo.springkafka.service.SpringKafkaTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Demo class
 *
 * @author junqiang.xiao@hand-china.com
 * @date 2018/1/11
 */
@RestController
public class SpringKafkaTestController {
    @Autowired
    SpringKafkaTestService springKafkaTestService;

    @RequestMapping("/sendMessage")
    public ResponseEntity sendMessage(@RequestParam String message, @RequestParam(required = false) Integer repeatCount, @RequestParam(required = false) String topic) {
        springKafkaTestService.sendMessage(message, repeatCount, topic);
        return ResponseEntity.ok().build();
    }


}
