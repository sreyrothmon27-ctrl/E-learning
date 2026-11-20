package edu.kh.istad.elearningg.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "categories")
@Getter
@Setter
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String icon;

    @Column(nullable = false)
    private Boolean isDeleted;

    @Column(nullable = false, length = 50)
    private String name;
}