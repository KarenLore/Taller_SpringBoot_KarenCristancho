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
@Table(name = "public_path")
@Entity
public class Path {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "role_path_id", nullable = false)
    private int rolePathId;

    @Column(name = "base_path", length = 255, nullable = false)
    private String basePath;

    @Column(name = "name", length = 255, nullable = false)
    private String name;

    @Column(name = "path", length = 255, nullable = false)
    private String path;

    @Column(name = "description", columnDefinition = "TEXT", nullable = false)
    private String description;
}