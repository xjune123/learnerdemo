package com.learner.learnerdemo.springkafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * Demo class
 *
 * @author junqiang.xiao@hand-china.com
 * @date 2018/1/11
 */
public interface SpringKafkaTestService {

    /**
     * 发送消息
     * @param message 发送消息内容
     */
   void sendMessage(String message);
}
