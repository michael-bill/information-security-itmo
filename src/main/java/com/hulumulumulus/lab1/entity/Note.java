package com.hulumulumulus.lab1.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "notes")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String content;

    private String author;
}

