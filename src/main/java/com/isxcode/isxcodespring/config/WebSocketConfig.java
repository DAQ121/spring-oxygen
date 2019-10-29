package com.isxcode.isxcodespring.config;

import com.isxcode.isxcodespring.websocket.HandShakeHandler;
import com.isxcode.isxcodespring.websocket.MyHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.standard.ServletServerContainerFactoryBean;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    /**
     * 注册websocket
     *
     * @since 2019-10-28
     */
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {

        registry.addHandler(myHandler(), "/myHandler")
                .addInterceptors(new HandShakeHandler())
                .setAllowedOrigins("*");

        registry.addHandler(myHandler(), "/myHandler")
                .addInterceptors(new HandShakeHandler())
                .setAllowedOrigins("*")
                .withSockJS()
                .setHeartbeatTime(30000);
    }

    /**
     * websocket 设置
     *
     * @since 2019-10-28
     */
    @Bean
    public ServletServerContainerFactoryBean createWebSocketContainer() {
        ServletServerContainerFactoryBean container = new ServletServerContainerFactoryBean();
        container.setMaxTextMessageBufferSize(8192);
        container.setMaxBinaryMessageBufferSize(8192);
        return container;
    }

    @Bean
    public WebSocketHandler myHandler() {
        return new MyHandler();
    }

}
