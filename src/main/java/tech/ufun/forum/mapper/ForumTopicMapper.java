package tech.ufun.forum.mapper;

import org.springframework.stereotype.Repository;
import tech.ufun.forum.domain.ForumTopic;

import java.util.List;

/**
 * 话题(ForumTopic)表数据库访问层
 *
 * @author 张雷
 * @since 2020-08-29 17:38:16
 */
@Repository
public interface ForumTopicMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ForumTopic findById(Long id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<ForumTopic> findAll();

    /**
     * 新增数据
     *
     * @param forumTopic 实例对象
     * @return 影响行数
     */
    int insert(ForumTopic forumTopic);

    /**
     * 修改数据
     *
     * @param forumTopic 实例对象
     * @return 影响行数
     */
    int update(ForumTopic forumTopic);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}