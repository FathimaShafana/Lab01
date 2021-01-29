package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.demo.model.User;

@RepositoryRestResource(collectionResourceRel = "users", path ="users")

public interface UserDao extends JpaRepository<User, Integer> {

}
