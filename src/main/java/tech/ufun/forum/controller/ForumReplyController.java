package tech.ufun.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.ufun.forum.domain.ForumReply;
import tech.ufun.forum.service.ForumReplyService;
import tech.ufun.framework.core.domain.AjaxResult;

/**
 * 回复(ForumReply)表控制层
 *
 * @author 张雷
 * @since 2020-08-26 16:11:52
 */
@RestController
@RequestMapping("forumReply")
public class ForumReplyController {

    /** 服务对象 */
    @Autowired
    private ForumReplyService forumReplyService;

    @PostMapping("/findAll")
    @ResponseBody
    public AjaxResult findAll(@RequestBody ForumReply forumReply) {
        return AjaxResult.success(forumReplyService.findAll(forumReply));
    }

    @PostMapping("findById/{id}")
    @ResponseBody
    public AjaxResult findById(@PathVariable String id) {
        return AjaxResult.success(this.forumReplyService.findById(id));
    }

    @PostMapping("/add")
    @ResponseBody
    public AjaxResult add(@RequestBody ForumReply forumReply) {
        return AjaxResult.success(forumReplyService.insert(forumReply));
    }

    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult edit(@RequestBody ForumReply forumReply) {
        return AjaxResult.success(forumReplyService.update(forumReply));
    }

    @PostMapping("/deleteById/{id}")
    @ResponseBody
    public AjaxResult deleteById(@PathVariable String id) {
        return AjaxResult.success(forumReplyService.deleteById(id));
    }
}