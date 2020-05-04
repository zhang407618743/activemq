import com.zq.mq.ProduceRun;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.jms.Queue;

/**
 * @Description
 * @Author ZhangQiQi
 * @Date2020/5/4 15:36
 **/
@SpringBootTest(classes = ProduceRun.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestMQ {


    @Autowired
    private Queue queue;

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Test
    public void send(){
        String str="消息123";
        jmsMessagingTemplate.convertAndSend(queue,str);
    }

}
