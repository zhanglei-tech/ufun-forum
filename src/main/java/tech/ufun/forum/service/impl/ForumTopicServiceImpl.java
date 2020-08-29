package tech.ufun.forum.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.ufun.forum.domain.ForumTopic;
import tech.ufun.forum.mapper.ForumTopicMapper;
import tech.ufun.forum.service.ForumTopicService;

import java.util.List;

/**
 * 话题(ForumTopic)表服务实现类
 *
 * @author 张雷
 * @since 2020-08-28 15:13:32
 */
@Service("forumTopicService")
public class ForumTopicServiceImpl implements ForumTopicService {

    @Autowired
    private ForumTopicMapper forumTopicMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ForumTopic findById(String id) {
        return this.forumTopicMapper.findById(id);
    }

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public List<ForumTopic> findAll(ForumTopic forumTopic) {
        return this.forumTopicMapper.findAll(forumTopic);
    }

    /**
     * 新增数据
     *
     * @param forumTopic 实例对象
     * @return 主键ID
     */
    @Override
    public int insert(ForumTopic forumTopic) {
        return this.forumTopicMapper.insert(forumTopic);
    }

    /**
     * 修改数据
     *
     * @param forumTopic 实例对象
     * @return 主键ID
     */
    @Override
    public int update(ForumTopic forumTopic) {
        return this.forumTopicMapper.update(forumTopic);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.forumTopicMapper.deleteById(id) > 0;
    }
}