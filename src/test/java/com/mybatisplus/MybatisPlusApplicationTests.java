package com.mybatisplus;

import com.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import javax.annotation.Resource;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Resource
    private UserService service;

    @Test
    void contextLoads() {
        System.out.println(service.listMaps());
    }
}