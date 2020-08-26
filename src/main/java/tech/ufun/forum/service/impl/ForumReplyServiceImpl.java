package tech.ufun.forum.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.ufun.forum.domain.ForumReply;
import tech.ufun.forum.mapper.ForumReplyMapper;
import tech.ufun.forum.service.ForumReplyService;

import java.util.List;

/**
 * 回复(ForumReply)表服务实现类
 *
 * @author 张雷
 * @since 2020-08-26 16:11:51
 */
@Service
public class ForumReplyServiceImpl implements ForumReplyService {

    @Autowired
    private ForumReplyMapper forumReplyMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ForumReply findById(String id) {
        return this.forumReplyMapper.findById(id);
    }

    /**
     * 查询多条数据
     *
     * @param forumReply 查询条件
     * @return 对象列表
     */
    @Override
    public List<ForumReply> findAll(ForumReply forumReply) {
        return this.forumReplyMapper.findAll(forumReply);
    }

    /**
     * 新增数据
     *
     * @param forumReply 实例对象
     * @return 主键ID
     */
    @Override
    public int insert(ForumReply forumReply) {
        return this.forumReplyMapper.insert(forumReply);
    }

    /**
     * 修改数据
     *
     * @param forumReply 实例对象
     * @return 主键ID
     */
    @Override
    public int update(ForumReply forumReply) {
        return this.forumReplyMapper.update(forumReply);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.forumReplyMapper.deleteById(id) > 0;
    }
}