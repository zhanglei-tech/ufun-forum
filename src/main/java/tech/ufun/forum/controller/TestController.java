package tech.ufun.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhanglei
 * @date 2020-08-26 10:18
 */
@Controller
@RequestMapping("/")
public class TestController {

    @RequestMapping("/")
    public String test() {
        return "test";
    }
}
