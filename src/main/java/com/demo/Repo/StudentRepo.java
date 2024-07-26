package com.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
