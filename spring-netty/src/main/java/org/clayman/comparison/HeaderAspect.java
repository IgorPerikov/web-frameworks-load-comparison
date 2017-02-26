package org.clayman.comparison;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HeaderAspect {

    @Before("execution(* org.springframework.web.server.adapter.HttpWebHandlerAdapter.handle " +
            "(org.springframework.http.server.reactive.ServerHttpRequest," +
            " org.springframework.http.server.reactive.ServerHttpResponse))" +
            " && args(request, response)")
    public void before(ServerHttpRequest request, ServerHttpResponse response) {
        response.getHeaders().add("Content-Length", "8");
    }
}
