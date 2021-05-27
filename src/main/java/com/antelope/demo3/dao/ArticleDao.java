package com.antelope.demo3.dao;

import com.antelope.demo3.entity.Article;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);
}