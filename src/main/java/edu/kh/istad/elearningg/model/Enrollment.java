package edu.kh.istad.elearningg.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "enrollments")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "enrolled_at", columnDefinition = "timestamp(6)")
    private LocalDateTime enrolledAt;

    @Column(name = "payment_at", columnDefinition = "timestamp(6)")
    private LocalDateTime paymentAt;

    @Column(name = "payment_method", length = 255)
    private String paymentMethod;

    @Column(name = "payment_status")
    private Boolean paymentStatus;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student_profile student;

}
