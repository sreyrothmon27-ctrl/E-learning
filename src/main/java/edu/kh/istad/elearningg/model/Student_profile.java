package edu.kh.istad.elearningg.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;



@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "student_profiles")
public class Student_profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;
    @Column(length = 255)
    private String biography;
    private String facebookLink;
    private String githubLink;
    private String major;
    private String phoneNumber;
    private String university;
}