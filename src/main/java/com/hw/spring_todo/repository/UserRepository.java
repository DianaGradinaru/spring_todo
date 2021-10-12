package com.hw.spring_todo.repository;

import com.hw.spring_todo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
