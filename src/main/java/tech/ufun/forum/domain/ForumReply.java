package tech.ufun.forum.domain;

import lombok.Data;

import java.util.Date;

/**
 * 回复(ForumReply)实体类
 *
 * @author 张雷
 * @since 2020-08-26 16:11:51
 */
@Data
public class ForumReply {
    /** 物理主键 */
    private Long id;
    /** 回复id */
    private String replyId;
    /** 主题id */
    private String postId;
    /** 作者 */
    private String author;
    /** 作者id */
    private String authorId;
    /** 回复内容 */
    private String replyContent;
    /** 回复时间 */
    private Date replyTime;
}