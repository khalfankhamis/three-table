package com.example.Three.table.only.repository;

import com.example.Three.table.only.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<Student,Long> {
}
