package com.example.project.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    @Id
    private String studentId;

    private String fullName;
    private String gender;
    private String email;

    @ManyToOne
    private Faculty faculty;
}
