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
}
