package com.abin.lee.rabbitmq.svr.skeleton.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

/**
 * Created by abin on 2017/10/30 2017/10/30.
 * rabbitmq-svr
 * com.abin.lee.rabbitmq.svr.skeleton.listener
 */

@Slf4j
@Service
public class RabbitmqServiceMonitor implements MessageListener {
    private static final String defaultCharset = "utf8";

    @Override
    public void onMessage(Message message) {
        String jsonStr = null;
        try {
            jsonStr = new String(message.getBody(), defaultCharset);
            log.info("received msg: " + jsonStr);
        } catch (Exception e) {
            log.error("提交出现异常, incomming msg: " + jsonStr, e);
        }
    }


}
