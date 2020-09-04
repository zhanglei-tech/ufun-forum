package tech.ufun.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页控制器
 *
 * @author zhanglei
 * @date 2020-08-28 08:40
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("/")
    public String index(ModelMap modelMap) {
        return "index";
    }
}
