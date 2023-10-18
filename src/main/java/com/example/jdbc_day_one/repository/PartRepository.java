package com.example.jdbc_day_one.repository;


import com.example.jdbc_day_one.model.Part;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartRepository extends ListCrudRepository<Part, Integer> {

}
