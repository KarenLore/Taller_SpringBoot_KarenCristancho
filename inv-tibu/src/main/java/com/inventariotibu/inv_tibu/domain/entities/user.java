package com.inventariotibu.inv_tibu.domain.entities;

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
@Table(name = "users")
@Entity
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "role_id", columnDefinition = "INTEGER")
    int roleId;

    @Column(name = "name", length = 255, nullable = false)
    String nameUser;

    @Column(name = "password", length = 255, nullable = false)
    String password;

    @Column(name = "username", length = 255, nullable = false)
    String username;
}
