package com.netcracker.pom.repository;

import com.netcracker.pom.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long>{
    Optional<Student> findById(long id);

    List<Student> findAll();

    Student save(Student student);

    void deleteById(long id);
}
