package com.example.r2dbc;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final MobileRepository mobileRepository;

    @GetMapping("test")
    public Mono<Mobile> test(){

        Mobile samsung = Mobile.builder().batteryCapacity(5200L).brand("samsung").build();
        return mobileRepository.save(samsung);

    }

    @GetMapping("")
    public Flux<Mobile> getAllMobile(){
        return mobileRepository.findAll();
    }
}
