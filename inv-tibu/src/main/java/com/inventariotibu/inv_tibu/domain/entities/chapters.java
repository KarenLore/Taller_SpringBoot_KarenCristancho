package com.inventariotibu.inv_tibu.domain.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Table(name = "chapter")
@Entity
public class chapters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "numberchapter", columnDefinition = "INTEGER")
    int numberChapter;

    @Column(name = "skill_id", columnDefinition = "INTEGER")
    int numberSkillId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "description", length = 80, nullable = false)
    String descripcion;

    @Column(name = "chapter_summary", columnDefinition = "TEXT", nullable = false)
    String summary;
}
