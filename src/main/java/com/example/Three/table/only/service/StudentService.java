package com.example.Three.table.only.service;

import com.example.Three.table.only.model.Student;
import com.example.Three.table.only.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student s){
        return studentRepository.save(s);
    }
    public List<Student> getAll(){
        return studentRepository.findAll();
    }
    public Optional<Student> findById(Long stuId){
        return studentRepository.findById(stuId);
    }
    public void deleteById(Long stuId){
        studentRepository.deleteById(stuId);
    }
}
