package com.example.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.practice.entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Long> {
          
}
