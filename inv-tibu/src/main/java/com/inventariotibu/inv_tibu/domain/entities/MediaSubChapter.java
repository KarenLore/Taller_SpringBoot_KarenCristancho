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
@Table(name = "public_media_sub_chapters")
@Entity
public class MediaSubChapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "media_id", nullable = false)
    int mediaId;

    @Column(name = "subchapter_id", nullable = false)
    int subchapterId;

    @Column(name = "created_at", nullable = false)
    LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    LocalDateTime updatedAt;

    @Column(name = "description", length = 30, nullable = false)
    String description;

    @Column(name = "title", columnDefinition = "TEXT", nullable = false)
    String title;
}
