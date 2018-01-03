package com.learner.learnerdemo.kafka;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;

import java.util.HashMap;
import java.util.Map;

public class TestStream {
    public static void main(String[] args) {
        /*事先创建好topic
        *
        bin/kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic my-input-topic

        bin/kafka-console-producer --broker-list localhost:9092 --topic my-input-topic

        bin/kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic my-output-topic

        bin/kafka-console-consumer --zookeeper localhost:2181 --topic my-output-topic --from-beginning
        * */
        Map<String, Object> props = new HashMap<>();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "my-stream-processing-application");
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        StreamsConfig config = new StreamsConfig(props);

        StreamsBuilder builder = new StreamsBuilder();
        builder.stream("my-input-topic").mapValues(value ->value.toString()).to("my-output-topic");
        KafkaStreams streams = new KafkaStreams(builder.build(), config);
        streams.start();
    }
}
