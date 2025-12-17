package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Stuentity;

public interface StudentRepository extends JpaRepository<StuEnt, Long> {
    
    
}