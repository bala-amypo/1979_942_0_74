package com.example.demo.service;

import org.springframework.
import org.springframework.demo.entity.Student;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImple implements StudentService {
   // private final StudentRepository studentRepository;
   // public StudentServiceImple(StudentRepository studentRepository){
   //     this.studentRepository=studentRepository;
   //}
   @Autowired
   StudentRepository studentRepository;

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

}