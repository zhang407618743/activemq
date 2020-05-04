package com.zq.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Description
 * @Author ZhangQiQi
 * @Date2020/5/4 15:28
 **/
@SpringBootApplication
@EnableScheduling
public class ProduceRun {

    public static void main(String[] args) {
        SpringApplication.run(ProduceRun.class,args);
    }

}
