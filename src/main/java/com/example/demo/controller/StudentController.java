package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;



@RestController
public class StudentController {
         @Autowired
         StudentService serv;

         @PostMapping("/create")
         public StudentEntity createData(@RequestBody StudentEntity st){
            return serv.insert(st);
         }
         
         @GetMapping("/get")
         public List<StudentEntity> getData(){
            return serv.getAll();
         }

         @GetMapping("/get/{id}")
         public Optional<StudentEntity> getbyId(@PathVariable Long id){
            return serv.getId(id);

         }

         @PutMapping("/update/{id}")
         public StudentEntity update(@PathVariable Long id,@RequestBody StudentEntity st){
            return serv.updateById(id,st);
           
         }

         @DeleteMapping("/delete")
         public String delete(){
            return serv.delete();
         }
}
