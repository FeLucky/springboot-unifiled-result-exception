package api.controller;

import api.annotation.RestReturn;
import api.entity.Test;
import org.springframework.web.bind.annotation.*;

/**
 * @author wangtiexiang
 * @Description
 * @Datetime 2020/3/23 5:29 下午
 */
@CrossOrigin
@RequestMapping("/")
@RestController
@RestReturn
public class TestController {

    @GetMapping("/getString")
    Object getString(){
        return "测试";
    }

    @GetMapping("/getEntity")
    Object getEntity(){
        Test test = Test.builder().id(1).info("helloworld").build();
        return test;
    }

    @GetMapping("/getException")
    Object getException(){
        return 1/0;
    }
}
