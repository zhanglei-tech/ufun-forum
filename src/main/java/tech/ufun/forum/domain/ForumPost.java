package tech.ufun.forum.domain;

import lombok.Data;

import java.util.Date;

/**
 * 主题(ForumPost)实体类
 *
 * @author 张雷
 * @since 2020-08-26 16:11:42
 */
@Data
public class ForumPost {
    /** 物理主键 */
    private Long id;
    /** 主题id */
    private String postId;
    /** 作者 */
    private String author;
    /** 作者id */
    private String authorId;
    /** 标题 */
    private String subject;
    /** 内容 */
    private String content;
    /** 创建时间 */
    private Date createTime;
    /** 是否置顶 */
    private Integer isTop;
    /** 浏览数 */
    private Integer viewCount;
    /** 回复数 */
    private Integer replayCount;
}