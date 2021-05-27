package com.antelope.demo3.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * Redis帮助类
 *
 * @author 孙阿龙
 */
@Repository
public class RedisHelper {
    public final RedisTemplate<String, String> redisTemplate;

    @Autowired
    public RedisHelper(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }


    /**
     * 保存
     *
     * @param key   键
     * @param value 值
     */
    public void save(String key, String value) {
        ValueOperations<String, String> valueOper = redisTemplate.opsForValue();
        valueOper.set(key, value);
    }

    /**
     * 保存
     *
     * @param key   键
     * @param value 值
     * @param timeout 过期时间
     * @param timeUnit 时间单位
     */
    public void save(String key, String value, Integer timeout, TimeUnit timeUnit) {
        ValueOperations<String, String> valueOper = redisTemplate.opsForValue();
        valueOper.set(key, value, timeout, timeUnit);
    }

    /**
     * 根据 key获取
     *
     * @param key 键
     * @return 字符串
     */
    public String get(String key) {
        //return RedissonUtils.getStrObj(key);
        ValueOperations<String, String> valueOper = redisTemplate.opsForValue();
        return valueOper.get(key);
    }

    /**
     * 判断key是否存在
     *
     * @param key key
     * @return 是否存在
     */
    public boolean isExist(String key) {
        return Optional.ofNullable(redisTemplate.hasKey(key)).orElse(false);
    }
    /**
     * 根据key删除
     *
     * @param key 键
     * @return boolean
     */
    public boolean delete(String key) {
        return Optional.ofNullable(redisTemplate.delete(key)).orElse(false);
    }

    /**
     * 根据key删除
     *
     * @param key 键
     */
    public void remove(String key) {
        //RedissonUtils.clearObj(key);
        ValueOperations<String, String> valueOper = redisTemplate.opsForValue();
        RedisOperations<String, String> redisOperations = valueOper.getOperations();
        redisOperations.delete(key);
    }

    /**
     * 获取HashTable
     *
     * @param table 表名
     * @param key   键
     * @return 对象
     */
    public Object getHash(String table, String key) {
        //return RedissonUtils.getMapObj(table, key);
        HashOperations<String, String, Object> hashOper = redisTemplate.opsForHash();
        return hashOper.get(table, key);
    }
    /**
     * 获取HashTable
     *
     * @param table 表名
     * @return 对象
     */
    /*public Object getAllHash(String table) {
        HashOperations<String, String, Object> hashOper = redisTemplate.opsForHash();
        return hashOper.values(table);
    }*/
    /**
     * 判断HashTable是否存在Key
     *
     * @param table 表名
     * @param key   键
     * @return 对象
     */
    public boolean hasKey(String table, String key) {
        HashOperations<String, String, Object> hashOper = redisTemplate.opsForHash();
        return hashOper.get(table, key) != null;
        //return RedissonUtils.getMapObj(table, key) != null;
    }

    /**
     * 设置HashTable
     *
     * @param table 表名
     * @param key   键
     * @param obj   对象
     */
    public void setHash(String table, String key, String obj) {
        //RedissonUtils.setMapObj(table, key, obj);
        HashOperations<String, String, Object> hashOper = redisTemplate.opsForHash();
        hashOper.put(table, key, obj);
    }
    /**
     * 设置HashTable
     *
     * @param table 表名
     * @param key   键
     * @param obj   对象
     */
    /*public void setHash(String table, String key, Object obj) {
        HashOperations<String, String, Object> hashOper = redisTemplate.opsForHash();
        hashOper.put(table, key, obj);
    }*/
}
