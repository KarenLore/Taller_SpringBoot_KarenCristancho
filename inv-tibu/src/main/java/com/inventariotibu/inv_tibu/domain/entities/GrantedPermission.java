package com.inventariotibu.inv_tibu.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "public_granted_permission")
@Entity
public class GrantedPermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "permit_all", nullable = false)
    boolean permitAll;

    @Column(name = "module_id", nullable = false)
    int moduleId;

    @Column(name = "role_id", nullable = false)
    int roleId;

    @Column(name = "http_method", length = 255, nullable = false)
    String httpMethod;

    @Column(name = "name", length = 255, nullable = false)
    String name;

    @Column(name = "path", length = 255, nullable = false)
    String path;
}
