package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", length = 30)
    private String fullName;

    @Column(name = "email", unique = true, length = 30,  nullable = false)
    private String email;

    @Column(name = "mobile", unique = true, length = 15)
    private String mobile;

    @Column(name = "password", unique = true)
    private String password;

    @Column(name = "avatar_url")
    private String avatarUrl;

    @Column(name = "last_login")
    private LocalDateTime lastLogin;

    @Column(name = "status")
    private boolean status;

    @Column(name = "note")
    private String note;
}
