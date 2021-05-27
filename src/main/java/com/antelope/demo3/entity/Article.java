package com.antelope.demo3.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * article
 * @author 
 */
@Data
public class Article implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 作者小编Id
     */
    private Integer customerId;

    /**
     * 资讯内容
     */
    private String content;

    /**
     * 标签提示外键
     */
    private Integer articleTipsId;

    /**
     * 资讯封面icon
     */
    private String icon;

    /**
     * 头条,资讯
     */
    private Object type;

    /**
     * 点赞数量
     */
    private Integer liked;

    /**
     * 分享次数
     */
    private Integer share;

    /**
     * 评论数量
     */
    private Integer comments;

    /**
     * 视屏封面
     */
    private String videoCover;

    /**
     * 视频
     */
    private String video;

    /**
     * 图片集合
     */
    private String pics;

    /**
     * 删除
     */
    private Boolean delete;

    /**
     * 创建日期
     */
    private Date created;

    /**
     * 阅读量
     */
    private Integer views;

    private static final long serialVersionUID = 1L;
}