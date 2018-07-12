package com.greenfoxacademy.practice.repositories;

import com.greenfoxacademy.practice.models.dtos.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {

}
