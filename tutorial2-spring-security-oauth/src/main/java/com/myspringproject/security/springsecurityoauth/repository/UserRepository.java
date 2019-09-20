package com.myspringproject.security.springsecurityoauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.myspringproject.security.springsecurityoauth.model.User;
public interface UserRepository extends JpaRepository<User, Long> {
    User findOneByUserName(String username);
}
