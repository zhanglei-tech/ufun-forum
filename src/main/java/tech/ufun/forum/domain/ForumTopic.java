package tech.ufun.forum.domain;

import lombok.Data;

/**
 * 话题(ForumTopic)实体类
 *
 * @author 张雷
 * @since 2020-08-28 15:13:30
 */
@Data
public class ForumTopic {
    /** 物理主键 */
    private Long id;
    /** 话题id */
    private String topicId;
    /** 话题 */
    private String topic;
    /** 顺序 */
    private Integer listOrder;
    /** 状态 */
    private Integer status;
}