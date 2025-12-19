package com.example.demo.serviceimplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceimplementation implements StudentService {
    @Autowired
    StudentRepository repo;

    @Override
    public StudentEntity insert(StudentEntity st) {
        return repo.save(st);
    }

    @Override
    public List<StudentEntity> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<StudentEntity> getId(Long id) {
        return repo.findById(id);
    }

    @Override
    public StudentEntity updateById(Long id, StudentEntity st) {
        return repo.save(st);
    }

    @Override
    public String delete() {
        repo.deleteAll();
        return "Deleted Successfully";
    }

}
