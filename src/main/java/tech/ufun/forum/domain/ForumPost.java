package tech.ufun.forum.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 主题(ForumPost)实体类
 *
 * @author 张雷
 * @since 2020-08-29 10:41:51
 */
@Data
public class ForumPost {
    /** 物理主键 */
    private Long id;
    /** 主题id */
    private String postId;
    /** 话题id */
    private String topicId;
    /** 话题 */
    private String topic;
    /** 话题key */
    private String topicKey;
    /** 作者 */
    private String author;
    /** 作者头像 */
    private String authorAvatar;
    /** 作者id */
    private String authorId;
    /** 标题 */
    private String subject;
    /** 内容 */
    private String content;
    /** 创建时间 */
    @JsonFormat(pattern="yyyy/MM/dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;
    /** 是否置顶 */
    private Integer isTop;
    /** 是否精华 */
    private Integer isEssence;
    /** 浏览数 */
    private Integer viewCount;
    /** 回复数 */
    private Integer replyCount;
}