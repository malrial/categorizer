package com.platform.categorizer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.platform.categorizer.model.business.Event;

@Repository
public interface EventRepository extends CrudRepository<Event,String>{

}
