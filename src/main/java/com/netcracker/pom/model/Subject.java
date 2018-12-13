package com.netcracker.pom.model;

import lombok.Data;
import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "subject")

public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long ID_Subject;
    private String name;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Subject_Student",
            joinColumns = { @JoinColumn(name = "id_subject") },
            inverseJoinColumns = { @JoinColumn(name = "id_student") }
    )
    private Set<Student> students;
}
