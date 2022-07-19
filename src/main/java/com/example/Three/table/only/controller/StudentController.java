package com.example.Three.table.only.controller;

import com.example.Three.table.only.model.Student;
import com.example.Three.table.only.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping
    public Student addStudent(@RequestBody Student s){
        return  studentService.addStudent(s);
    }
    @GetMapping("/{stuId}")
    public List<Student> getAll(){
        return studentService.getAll();
    }
    @GetMapping("/{stuId}")
    public Optional<Student> getById(@PathVariable Long stuId){
        return studentService.findById(stuId);
    }
    @PutMapping("/{stuId}")
    public Student updateStudent(@RequestBody Student s,@PathVariable Long stuId){
        s.setStuId(stuId);
        return  studentService.addStudent(s);
    }
    @DeleteMapping("/{stuId}")
    public void deleteMe(@PathVariable Long stuId){
        studentService.deleteById(stuId);
    }


}
