package com.example.project.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "faculty")
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long facultyId;
    private String facultyName;
    private String facultyEmail;


    @OneToMany(mappedBy = "faculty", cascade = CascadeType.ALL)
    private Set<Student> students = new HashSet<>();

}
