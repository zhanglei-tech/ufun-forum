package tech.ufun.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.ufun.forum.domain.ForumTopic;
import tech.ufun.forum.service.ForumTopicService;
import tech.ufun.framework.core.domain.AjaxResult;

/**
 * 话题(ForumTopic)表控制层
 *
 * @author 张雷
 * @since 2020-08-28 15:13:34
 */
@RestController
@RequestMapping("forumTopic")
public class ForumTopicController {

    /** 服务对象 */
    @Autowired
    private ForumTopicService forumTopicService;

    @PostMapping("/findAll")
    @ResponseBody
    public AjaxResult findAll(@RequestBody ForumTopic forumTopic) {
        return AjaxResult.success(forumTopicService.findAll(forumTopic));
    }

    @PostMapping("findById/{id}")
    @ResponseBody
    public AjaxResult findById(@PathVariable String id) {
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
    public AjaxResult deleteById(@PathVariable String id) {
        return AjaxResult.success(forumTopicService.deleteById(id));
    }
}