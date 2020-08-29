package tech.ufun.forum.service;

import tech.ufun.forum.domain.ForumTopic;

import java.util.List;

/**
 * 话题(ForumTopic)表服务接口
 *
 * @author 张雷
 * @since 2020-08-28 15:13:32
 */
public interface ForumTopicService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ForumTopic findById(String id);

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    List<ForumTopic> findAll(ForumTopic forumTopic);

    /**
     * 新增数据
     *
     * @param forumTopic 实例对象
     * @return 主键ID
     */
    int insert(ForumTopic forumTopic);

    /**
     * 修改数据
     *
     * @param forumTopic 实例对象
     * @return 主键ID
     */
    int update(ForumTopic forumTopic);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}