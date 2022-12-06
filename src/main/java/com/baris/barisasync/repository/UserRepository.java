package com.baris.barisasync.repository;

import com.baris.barisasync.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}