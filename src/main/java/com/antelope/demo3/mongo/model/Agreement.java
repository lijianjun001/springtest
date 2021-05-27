package com.antelope.demo3.mongo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.Date;

@Document(collection = "AgreementMongo")
@Data
public class Agreement {
    /**
     * 主键
     */
    private String id;
    /**
     * 用户id
     */
    @Field("CustomerId")
    private int customerId;
    /**
     * 项目DI
     */
    @Field("ProjectId")
    private int projectId ;
    /**
     * 订单编号
     */
    @Field("OrderCode")
    private String orderCode ;
    /**
     * url
     */
    @Field("Url")
    private String url;
    /**
     * 返回json
     */
    @Field("ReturnJson")
    private String returnJson ;
    /**
     * 创建时间
     */
    @Field("Created")
    private Date created ;
}
