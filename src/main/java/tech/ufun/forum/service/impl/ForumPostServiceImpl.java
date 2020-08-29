package tech.ufun.forum.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.ufun.forum.domain.ForumPost;
import tech.ufun.forum.mapper.ForumPostMapper;
import tech.ufun.forum.service.ForumPostService;

import java.util.List;

/**
 * 主题(ForumPost)表服务实现类
 *
 * @author 张雷
 * @since 2020-08-29 10:41:51
 */
@Service
public class ForumPostServiceImpl implements ForumPostService {

    @Autowired
    private ForumPostMapper forumPostMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ForumPost findById(String id) {
        return this.forumPostMapper.findById(id);
    }

    /**
     * 查询多条数据
     *
     * @param forumPost 查询条件
     * @return 对象列表
     */
    @Override
    public List<ForumPost> findAll(ForumPost forumPost) {
        return this.forumPostMapper.findAll(forumPost);
    }

    /**
     * 新增数据
     *
     * @param forumPost 实例对象
     * @return 主键ID
     */
    @Override
    public int insert(ForumPost forumPost) {
        return this.forumPostMapper.insert(forumPost);
    }

    /**
     * 修改数据
     *
     * @param forumPost 实例对象
     * @return 主键ID
     */
    @Override
    public int update(ForumPost forumPost) {
        return this.forumPostMapper.update(forumPost);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.forumPostMapper.deleteById(id) > 0;
    }
}