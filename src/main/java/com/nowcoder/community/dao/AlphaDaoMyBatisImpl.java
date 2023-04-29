package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AlphaDaoMyBatisImpl implements AlphaDao{
    @Override
    public String select() {
        return "Mybatis";
    }//原本用H实现的，后面换成M实现只需要增加一个@primery 的注解，实现类就会变成M
}
