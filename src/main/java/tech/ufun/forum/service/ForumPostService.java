package tech.ufun.forum.service;

import tech.ufun.forum.domain.ForumPost;
import tech.ufun.framework.core.page.PageData;

import java.util.List;

/**
 * 主题(ForumPost)表服务接口
 *
 * @author 张雷
 * @since 2020-08-29 10:41:51
 */
public interface ForumPostService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ForumPost findById(String id);

    /**
     * 查询多条数据
     *
     * @param forumPost 查询条件
     * @return 对象列表
     */
    PageData findAll(ForumPost forumPost);

    /**
     * 新增数据
     *
     * @param forumPost 实例对象
     * @return 影响行数
     */
    int insert(ForumPost forumPost);

    /**
     * 修改数据
     *
     * @param forumPost 实例对象
     * @return 影响行数
     */
    int update(ForumPost forumPost);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}