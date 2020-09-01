package tech.ufun.forum.mapper;

import org.springframework.stereotype.Repository;
import tech.ufun.forum.domain.ForumReply;

import java.util.List;

/**
 * 回复(ForumReply)表数据库访问层
 *
 * @author 张雷
 * @since 2020-08-26 16:11:51
 */
@Repository
public interface ForumReplyMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ForumReply findById(String id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param forumReply 实例对象
     * @return 对象列表
     */
    List<ForumReply> findAll(ForumReply forumReply);

    /**
     * 新增数据
     *
     * @param forumReply 实例对象
     * @return 影响行数
     */
    int insert(ForumReply forumReply);

    /**
     * 修改数据
     *
     * @param forumReply 实例对象
     * @return 影响行数
     */
    int update(ForumReply forumReply);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}