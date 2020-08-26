package tech.ufun.forum.service;

import tech.ufun.forum.domain.ForumReply;

import java.util.List;

/**
 * 回复(ForumReply)表服务接口
 *
 * @author 张雷
 * @since 2020-08-26 16:11:51
 */
public interface ForumReplyService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ForumReply findById(String id);

    /**
     * 查询多条数据
     *
     * @param forumReply 查询条件
     * @return 对象列表
     */
    List<ForumReply> findAll(ForumReply forumReply);

    /**
     * 新增数据
     *
     * @param forumReply 实例对象
     * @return 主键ID
     */
    int insert(ForumReply forumReply);

    /**
     * 修改数据
     *
     * @param forumReply 实例对象
     * @return 主键ID
     */
    int update(ForumReply forumReply);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}