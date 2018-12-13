package com.netcracker.pom.controller;

import com.netcracker.pom.model.Subject;
import com.netcracker.pom.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/subject")
public class SubjectController {
    @Autowired
    private SubjectRepository repository;

    @GetMapping
    public List<Subject> getSubjects() {
        return repository.findAll();
    }

    @GetMapping(path = "/{id}")
    public List<Subject> getDiscipline(@PathVariable Long id) {
        return repository.getSubjectsByStudentId(id);
    }
}