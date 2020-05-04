package com.zq.mq.produce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description
 * @Author ZhangQiQi
 * @Date2020/5/4 15:30
 **/
@Component
public class Produce {

    @Autowired
    private Queue queue;

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    private AtomicInteger count = new AtomicInteger(0);

    public void send(){
        String str="发送消息："+ UUID.randomUUID().toString().substring(0,6);
        jmsMessagingTemplate.convertAndSend(queue,str);
    }

    @Scheduled(fixedDelay = 3000)
    public void scheduleding(){
        int i = count.incrementAndGet();
        System.out.println("第"+i+"次，定时发送消息");
        send();
    }


}
