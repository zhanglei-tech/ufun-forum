package tech.ufun.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import tech.ufun.forum.domain.ForumTopic;
import tech.ufun.forum.service.ForumTopicService;
import tech.ufun.framework.core.domain.AjaxResult;

import java.util.List;

/**
 * 话题(ForumTopic)表控制层
 *
 * @author 张雷
 * @since 2020-08-29 17:38:16
 */
@Controller
@RequestMapping("topic")
public class ForumTopicController {

    /** 服务对象 */
    @Autowired
    private ForumTopicService forumTopicService;

    @GetMapping("/{key}")
    public String index(@PathVariable String key, ModelMap modelMap) {
        // 话题
        List<ForumTopic> topics = forumTopicService.findAll();
        modelMap.put("topics", topics);
        modelMap.put("topicKey", key);

        return "/topic/index";
    }

    @PostMapping("/findAll")
    @ResponseBody
    public AjaxResult findAll() {
        return AjaxResult.success(forumTopicService.findAll());
    }

    @PostMapping("findById/{id}")
    @ResponseBody
    public AjaxResult findById(@PathVariable Long id) {
        return AjaxResult.success(this.forumTopicService.findById(id));
    }

    @PostMapping("/add")
    @ResponseBody
    public AjaxResult add(@RequestBody ForumTopic forumTopic) {
        return AjaxResult.success(forumTopicService.insert(forumTopic));
    }

    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult edit(@RequestBody ForumTopic forumTopic) {
        return AjaxResult.success(forumTopicService.update(forumTopic));
    }

    @PostMapping("/deleteById/{id}")
    @ResponseBody
    public AjaxResult deleteById(@PathVariable Long id) {
        return AjaxResult.success(forumTopicService.deleteById(id));
    }
}