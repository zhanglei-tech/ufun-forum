package tech.ufun.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.ufun.forum.domain.ForumPost;
import tech.ufun.forum.domain.ForumTopic;
import tech.ufun.forum.service.ForumPostService;
import tech.ufun.forum.service.ForumTopicService;

import java.util.List;

/**
 * 首页控制器
 *
 * @author zhanglei
 * @date 2020-08-28 08:40
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private ForumTopicService forumTopicService;

    @Autowired
    private ForumPostService forumPostService;

    @GetMapping("/")
    public String index(ModelMap modelMap) {
        // 话题
        List<ForumTopic> topics = forumTopicService.findAll();
        modelMap.put("topics", topics);

        List<ForumPost> topPosts = forumPostService.findAllTop();
        modelMap.put("topPosts", topPosts);

        return "index";
    }
}
