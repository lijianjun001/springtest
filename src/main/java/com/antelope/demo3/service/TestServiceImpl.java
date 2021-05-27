package com.antelope.demo3.service;

import com.antelope.demo3.dao.ArticleDao;
import com.antelope.demo3.mongo.AgreementRep;
import com.antelope.demo3.redis.RedisHelper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@AllArgsConstructor
public class TestServiceImpl implements TestService {


    final ArticleDao articleDao;

    final AgreementRep agreementRep;

    final RedisHelper redisHelper;

//    public TestService(ArticleDao articleDao, AgreementRep agreementRep, RedisHelper redisHelper) {
//        this.articleDao = articleDao;
//        this.agreementRep = agreementRep;
//        this.redisHelper = redisHelper;
//    }


    public String getName() {

        return articleDao.selectByPrimaryKey(10).toString();


    }

    public String getName2() {
        return agreementRep.findAll().toString();
    }


    public String getName3() {
        redisHelper.save("aaa", "ljjlll");
        return redisHelper.get("aaa");
    }
}
