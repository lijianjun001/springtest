package com.antelope.demo3.mongo;


import com.antelope.demo3.mongo.model.Agreement;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgreementRep extends MongoRepository<Agreement,String> {
}
