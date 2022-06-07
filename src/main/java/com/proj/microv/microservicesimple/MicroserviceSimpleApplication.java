package com.proj.microv.microservicesimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@EnableKafka
@SpringBootApplication
public class MicroserviceSimpleApplication {

    @KafkaListener(topics = "msg")
    public void msgListener(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSimpleApplication.class, args);
    }

}
