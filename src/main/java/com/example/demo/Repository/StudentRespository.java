package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PracticeProject.entity.StuEnt;

public interface StudentRepository extends JpaRepository<StuEnt, Long> {
    
    
}