package edu.kh.istad.elearningg.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "videos")
@Getter
@Setter
@NoArgsConstructor
public class Videos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String duration;

    private Boolean isDeleted;

    private Boolean isPublished;

    private String slug;

    private String thumbnail;

    private String title;

    private String youtube;

    // Many Videos belong to One Course
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;

    // One Video has Many Comments
    @OneToMany(mappedBy = "video")
    private List<Comments> comments;
}