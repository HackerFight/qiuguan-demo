package com.qiuguan.demo.web;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author qiuguan
 * @date 2023/04/04 23:09:18  星期二
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello__" + LocalDateTime.now();
    }
}
