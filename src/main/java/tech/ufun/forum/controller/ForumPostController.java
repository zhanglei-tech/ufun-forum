package tech.ufun.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.ufun.forum.domain.ForumPost;
import tech.ufun.forum.service.ForumPostService;
import tech.ufun.framework.core.domain.AjaxResult;

/**
 * 主题(ForumPost)表控制层
 *
 * @author 张雷
 * @since 2020-08-26 16:11:47
 */
@RestController
@RequestMapping("forumPost")
public class ForumPostController {

    /** 服务对象 */
    @Autowired
    private ForumPostService forumPostService;

    @PostMapping("/findAll")
    @ResponseBody
    public AjaxResult findAll(@RequestBody ForumPost forumPost) {
        return AjaxResult.success(forumPostService.findAll(forumPost));
    }

    @PostMapping("findById/{id}")
    @ResponseBody
    public AjaxResult findById(@PathVariable String id) {
        return AjaxResult.success(this.forumPostService.findById(id));
    }

    @PostMapping("/add")
    @ResponseBody
    public AjaxResult add(@RequestBody ForumPost forumPost) {
        return AjaxResult.success(forumPostService.insert(forumPost));
    }

    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult edit(@RequestBody ForumPost forumPost) {
        return AjaxResult.success(forumPostService.update(forumPost));
    }

    @PostMapping("/deleteById/{id}")
    @ResponseBody
    public AjaxResult deleteById(@PathVariable String id) {
        return AjaxResult.success(forumPostService.deleteById(id));
    }
}