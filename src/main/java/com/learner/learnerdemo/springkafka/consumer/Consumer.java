package com.learner.learnerdemo.springkafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Demo class
 *
 * @author junqiang.xiao@hand-china.com
 * @date 2018/1/11
 */
@Component
public class Consumer {
    @KafkaListener(topics = {"test_topic"})
    public void receive(ConsumerRecord<?, ?> record) {
        System.out.println("消费消息:" + record.value().toString()+ " 时间:"+new Date());
        System.out.println("消费消息key:" + record.key() + "  partition:" + record.partition());

    }
}
