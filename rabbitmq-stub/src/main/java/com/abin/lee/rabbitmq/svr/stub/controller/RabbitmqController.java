package com.abin.lee.rabbitmq.svr.stub.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by abin on 2017/10/30 2017/10/30.
 * rabbitmq-svr
 * com.abin.lee.rabbitmq.svr.stub.controller
 */
@Controller
@Slf4j
public class RabbitmqController {

    @Autowired
    public AmqpTemplate amqpTemplate;
//    @Value("#{appConfig['rabbitmq.queue']}")
//    @Value("${rabbitmq.routing.key}")
//    String routingKey;
    String routingKey = "lendRoutingKey";
    @Value("${rabbitmq.queue}")
    String queue;


    @ResponseBody
    @RequestMapping("/sendQueue")
    public String testQueue(String name, Integer age) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("name", name);
            map.put("age", age);
            log.error("map={} routingKey={}", map, routingKey);
            amqpTemplate.convertAndSend(map);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("e={}", e);
        }
        return "发送完毕";
    }

}
