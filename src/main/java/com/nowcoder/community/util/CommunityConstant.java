package com.nowcoder.community.util;

public interface CommunityConstant {
    int ACTIVATION_SUCCESS = 0;

    int ACTIVATION_REPEAT = 1;

    int ACTIVATION_FAILURE = 2;
    //默认状态的登录凭证超时时间
    int DEFAULT_EXPIRED_SECOND = 3600*12;
    //点了勾选记住我后的超时时间
    int REMEMBER_EXPIRED_SECOND = 3600*24*100;

    //实体类型：帖子
    int ENTITY_TYPE_POST = 1;
    //评论
    int ENTITY_TYPE_COMMENT = 2;
    //用户
    int ENTITY_TYPE_USER = 3;
    //主题 ：评论
    String TOPIC_COMMENT = "comment";
    //主题 ：点赞
    String TOPIC_LIKE = "like";
    //主题 ：关注
    String TOPIC_FOLLOW = "follow";
    //主题：发帖
    String TOPIC_PUBLISH = "publish";
    //主题：删帖
    String TOPIC_DELETE = "delete";
    //系统的id
    int SYSTEM_USER_ID = 1;
    //普通用户
    String AUTHORITY_USER = "user";
    //管理员
    String AUTHORITY_ADMIN = "admin";
    //版主
    String AUTHORITY_MODERATOR = "moderator";

}
