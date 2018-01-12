package com.learner.learnerdemo.springkafka.service.impl;

import com.learner.learnerdemo.springkafka.service.SpringKafkaTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.UUID;

/**
 * Demo class
 *
 * @author junqiang.xiao@hand-china.com
 * @date 2018/1/11
 */
@Service
public class SpringKafkaTestServiceImpl implements SpringKafkaTestService {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Override
    public void sendMessage(String message) {
        String key = UUID.randomUUID().toString();
        //key ="1";//测试如果key 一样，给的partition 均一致保证同一个key 都会到一个partition 上执行
        ListenableFuture future = kafkaTemplate.send("test_topic", key, message);
        future.addCallback(o -> System.out.println("send-消息发送成功：" + message),
                throwable -> System.out.println("消息发送失败：" + message));
    }
}
