package com.spring.kafka.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/topic/test")
@Slf4j
public class Controller {

    @Autowired
    private Producer producer;

    @RequestMapping(method = RequestMethod.GET)
    public void send(@RequestParam(defaultValue = "test") String data) {
        producer.send(data);
    }
}