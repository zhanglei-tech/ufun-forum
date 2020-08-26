package tech.ufun.forum.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanglei
 * @date 2020-08-26 10:18
 */
@RestController
@RequestMapping("/")
public class TestController {

    @RequestMapping("/")
    public String test() {
        return "Hello";
    }
}
