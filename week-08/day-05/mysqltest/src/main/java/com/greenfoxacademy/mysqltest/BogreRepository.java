package com.greenfoxacademy.mysqltest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BogreRepository extends CrudRepository<Bogre, Long> {

}
