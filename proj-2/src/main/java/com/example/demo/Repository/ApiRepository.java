package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Student;
@Repository
public interface ApiRepository extends JpaRepository<Student,Integer> {

}
