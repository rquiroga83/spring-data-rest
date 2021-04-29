package com.example.nebula.springdatarest.repositories;

import java.util.List;

import com.example.nebula.springdatarest.models.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface  UserRepository extends CrudRepository<User, Long> {
    
    List<User> findByName(@Param("name") String name);
}
