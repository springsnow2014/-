package com.project.websocket;

import org.springframework.stereotype.Component;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import javax.annotation.Resource;


/**
 * WebScoket配置处理器
 */
@Component
@EnableWebSocket
public class ChatWebSocketConfig extends WebMvcConfigurerAdapter
    implements WebSocketConfigurer {
    @Resource
    ChatWebSocketHandle handler;

    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(handler, "/commonapi/chat/websocket")
                .addInterceptors(new ChatWebSocketShake());
        registry.addHandler(handler, "/commonapi/chat/sockjs/websocket")
                .addInterceptors(new ChatWebSocketShake()).withSockJS();
    }
}

