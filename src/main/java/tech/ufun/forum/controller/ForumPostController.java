package tech.ufun.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tech.ufun.forum.domain.ForumPost;
import tech.ufun.forum.service.ForumPostService;
import tech.ufun.framework.core.domain.AjaxResult;
import tech.ufun.framework.core.page.PageData;

/**
 * 主题(ForumPost)表控制层
 *
 * @author 张雷
 * @since 2020-08-29 10:41:51
 */
@Controller
@RequestMapping("post")
public class ForumPostController {

    /** 服务对象 */
    @Autowired
    private ForumPostService forumPostService;

    @GetMapping("/add")
    public String add() {
        return "post/add";
    }

    @PostMapping("/findAll")
    @ResponseBody
    public PageData findAll(ForumPost forumPost) {
        return forumPostService.findAll(forumPost);
    }

    @PostMapping("findById/{id}")
    @ResponseBody
    public AjaxResult findById(@PathVariable String id) {
        return AjaxResult.success(this.forumPostService.findById(id));
    }

    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addPost(ForumPost forumPost) {
        return AjaxResult.success(forumPostService.insert(forumPost));
    }

    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editPost( ForumPost forumPost) {
        return AjaxResult.success(forumPostService.update(forumPost));
    }

    @PostMapping("/deleteById/{id}")
    @ResponseBody
    public AjaxResult deleteById(@PathVariable String id) {
        return AjaxResult.success(forumPostService.deleteById(id));
    }
}