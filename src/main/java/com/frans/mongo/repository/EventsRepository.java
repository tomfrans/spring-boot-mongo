package com.frans.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.frans.mongo.dto.Event;

@Repository
public interface EventsRepository extends MongoRepository<Event,String>{

	 public List<Event> findByCategoryName(String categoryName);
}

