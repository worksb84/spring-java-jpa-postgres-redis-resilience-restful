package com.example.demo.domain;

import java.sql.Date;

import org.springframework.data.annotation.Id;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String nickname;
    private String password;
    private String role;
    private Date loginAt;
    private Date createdAt;
    @Nullable
    private Date modifyAt;
    @Nullable
    private Date deleteAt;
}
