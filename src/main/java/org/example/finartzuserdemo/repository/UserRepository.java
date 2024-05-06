package org.example.finartzuserdemo.repository;

import org.example.finartzuserdemo.model.entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;


    public interface UserRepository extends JpaRepository<User, Long> {
        User save(User user);
    }

