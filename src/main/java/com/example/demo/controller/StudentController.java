package com.example.demo.controller;






import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
@RestController
public class StudentController{
    @Autowired
    StudentService studentService;

    @PostMapping("/postdata")
    public Student postdata(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

}