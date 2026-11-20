package edu.kh.istad.elearningg.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "instructor_profiles")
@Getter
@Setter
@NoArgsConstructor
public class Instructor_profiles {

    @Id
    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(length = 255)
    private String biography;

    @Column(length = 255)
    private String facebookLink;

    @Column(length = 255)
    private String githubLink;

    @Column(length = 255)
    private String jobTitle;

    @Column(length = 255)
    private String phoneNumber;
}
