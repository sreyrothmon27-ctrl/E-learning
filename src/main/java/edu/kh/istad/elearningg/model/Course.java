
package edu.kh.istad.elearningg.model;

import edu.kh.istad.elearningg.model.Category;
import edu.kh.istad.elearningg.model.Enrollment;
import edu.kh.istad.elearningg.model.Instructor_profiles;
import edu.kh.istad.elearningg.model.Videos;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "count_rating")
    private Integer countRating;

    @Column(name = "created_at", columnDefinition = "timestamp(6)")
    private LocalDateTime createdAt;

    @Column(length = 255)
    private String description;

    @Column(name = "discount_percent")
    private Float discountPercent;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @Column(name = "is_published")
    private Boolean isPublished;

    @Column(length = 255)
    private String keyword;

    @Column(length = 255)
    private String level;

    @Column(precision = 38, scale = 2)
    private BigDecimal price;

    @Column(length = 255)
    private String slug;

    @Column(name = "star_rating")
    private Float starRating;

    @Column(length = 255)
    private String thumbnail;

    @Column(length = 255)
    private String title;

    @Column(name = "total_hours")
    private Float totalHours;

    @Column(name = "updated_at", columnDefinition = "timestamp(6)")
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Instructor_profiles instructor;

    @OneToMany(mappedBy = "course")
    private List<Videos> videos = new ArrayList<>();

    @OneToMany(mappedBy = "course")
    private List<Enrollment> enrollments = new ArrayList<>();

}
