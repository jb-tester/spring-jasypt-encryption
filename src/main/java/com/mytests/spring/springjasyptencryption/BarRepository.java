package com.mytests.spring.springjasyptencryption;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface BarRepository extends CrudRepository<Bar, Integer> {

    List<Bar> findAll();

    @Query("select e from Bar e where e.name = :name")
    List<Bar> customQuery(@Param("name") String arg);
}
