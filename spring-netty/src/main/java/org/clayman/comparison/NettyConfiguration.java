package org.clayman.comparison;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.webflux.DefaultReactiveWebServerCustomizer;
import org.springframework.boot.context.embedded.reactor.ReactorNettyReactiveWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NettyConfiguration {

    @Bean
    public DefaultReactiveWebServerCustomizer defaultReactiveWebServerCustomizer(ServerProperties serverProperties) {
        return new DefaultReactiveWebServerCustomizer(serverProperties);
    }

    @Bean
    public ReactorNettyReactiveWebServerFactory reactorNettyReactiveWebServerFactory() {
        // TODO:
        return new ReactorNettyReactiveWebServerFactory();
    }

    @Bean
    ServerProperties serverProperties() {
        // TODO:
        return new ServerProperties();
    }
}
