package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.StudentEntity;

public interface StudentService {

    public StudentEntity insert(StudentEntity st);

    public List<StudentEntity> getAll();

    public Optional<StudentEntity> getId(Long id);

    public StudentEntity updateById(Long id, StudentEntity st);

    public String delete();

}
