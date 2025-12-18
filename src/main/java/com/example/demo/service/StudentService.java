package com.example.practice.service;

import java.util.List;
import java.util.Optional;

import com.example.practice.entity.StudentEntity;

public interface StudentService {

    public StudentEntity insert(StudentEntity st);

    public List<StudentEntity> getAll();

    public Optional<StudentEntity> getId(Long id);

    public StudentEntity updateById(Long id, StudentEntity st);

    public String delete();

}
