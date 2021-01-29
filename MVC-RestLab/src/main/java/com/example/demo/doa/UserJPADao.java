package com.example.demo.doa;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.User;

public interface UserJPADao extends JpaRepository<User, Integer>{

}
