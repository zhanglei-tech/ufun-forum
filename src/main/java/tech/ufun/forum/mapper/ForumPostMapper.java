package tech.ufun.forum.mapper;

import org.springframework.stereotype.Repository;
import tech.ufun.forum.domain.ForumPost;

import java.util.List;

/**
 * 主题(ForumPost)表数据库访问层
 *
 * @author 张雷
 * @since 2020-08-29 10:41:51
 */
@Repository
public interface ForumPostMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param postId 主键
     * @return 实例对象
     */
    ForumPost findById(String postId);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param forumPost 查询条件
     * @return 对象列表
     */
    List<ForumPost> findAll(ForumPost forumPost);

    /**
     * 查询置顶帖子
     *
     * @return 对象列表
     */
    List<ForumPost> findAllTop();

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
     * @param postId 主键
     * @return 影响行数
     */
    int deleteById(String postId);

}