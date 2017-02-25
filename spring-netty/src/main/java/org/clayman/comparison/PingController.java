package org.clayman.comparison;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Random;

@RestController
public class PingController {

    private final Random RANDOM = new Random();

    @GetMapping("/ping")
    public Mono<Integer> ping() {
        return Mono.just(RANDOM.nextInt());
    }
}
