package com.zq.mq.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * @Description
 * @Author ZhangQiQi
 * @Date2020/5/4 15:23
 **/
@Component
public class Consumer {


    @JmsListener(destination = "${myqueue}")
    public void reiver(TextMessage textMessage) throws JMSException {
        String text = textMessage.getText();
        System.out.println("消费者接收消息："+text);

    }


}
