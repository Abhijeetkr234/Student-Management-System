package com.AbhijeetProject.sms.repository;

import com.AbhijeetProject.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Long> {
}
