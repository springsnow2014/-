package com.project.websocket;

import com.project.controller.LoginModel;

import com.project.util.CommonVal;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;

import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import java.util.Map;

import javax.servlet.http.HttpSession;


/**
 * Socket建立连接(握手)和断开
 */
public class ChatWebSocketShake implements HandshakeInterceptor {
    public boolean beforeHandshake(ServerHttpRequest request,
        ServerHttpResponse response, WebSocketHandler wsHandler,
        Map<String, Object> attributes) throws Exception {
        if (request instanceof ServletServerHttpRequest) {
            ServletServerHttpRequest servletRequest = (ServletServerHttpRequest) request;
            HttpSession session = servletRequest.getServletRequest()
                                                .getSession(false);
            LoginModel login = (LoginModel) session.getAttribute(CommonVal.sessionName); //获取当前登录账号信息
                                                                                         // 标记用户

            if (login != null) {
                attributes.put(CommonVal.websocketSessionName,
                    login.getLoginType() + "-" + login.getId()); //登录用户session由登录id+登录类型组成
            } else {
                return false;
            }
        }

        return true;
    }

    public void afterHandshake(ServerHttpRequest request,
        ServerHttpResponse response, WebSocketHandler wsHandler,
        Exception exception) {
    }
}

