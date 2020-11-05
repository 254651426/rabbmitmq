package com.yangjie.simple;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.yangjie.Utils.ConnectionUtils;

/**
 * @Author: qingshan
 * @Description: 咕泡学院，只为更好的你
 * 消息生产者
 */
public class MyProducer {
    private final static String EXCHANGE_NAME = "SIMPLE_EXCHANGE";

    public static void main(String[] args) throws Exception {
        //建立连接
        Connection conn = ConnectionUtils.getConnection();
        // 创建消息通道
        Channel channel = conn.createChannel();

        // 发送消息
        String msg = "Hello world, Rabbit MQ";

        // String exchange, String routingKey, BasicProperties props, byte[] body
        channel.basicPublish("", "gupao.best", null, msg.getBytes());

        channel.close();
        conn.close();
    }
}

