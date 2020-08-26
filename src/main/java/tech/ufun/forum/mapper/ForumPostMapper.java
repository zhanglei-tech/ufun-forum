package tech.ufun.forum.mapper;

import org.apache.ibatis.annotations.Mapper;
import tech.ufun.forum.domain.ForumPost;

import java.util.List;

/**
 * 主题(ForumPost)表数据库访问层
 *
 * @author 张雷
 * @since 2020-08-26 16:11:44
 */
@Mapper
public interface ForumPostMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ForumPost findById(String id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param forumPost 实例对象
     * @return 对象列表
     */
    List<ForumPost> findAll(ForumPost forumPost);

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
     * @return 影响行数
     */
    int deleteById(String id);

}