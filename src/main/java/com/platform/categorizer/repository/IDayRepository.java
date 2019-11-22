package com.platform.categorizer.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.platform.categorizer.model.business.Day;

@Repository
public interface IDayRepository extends JpaRepository<Day, Date>{

}
