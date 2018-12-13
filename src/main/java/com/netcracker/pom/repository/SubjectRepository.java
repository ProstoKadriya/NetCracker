package com.netcracker.pom.repository;

import com.netcracker.pom.model.Subject;
import org.jboss.logging.Param;
//import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
    List<Subject> getSubjectsByStudentId(@Param("id") Long id);

    List<Subject> findAll();
}
