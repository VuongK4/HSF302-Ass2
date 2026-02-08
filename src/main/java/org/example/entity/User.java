package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    @Column(name = "full_name", length = 30, columnDefinition = "VARCHAR(30)")
    private String fullName;

    @Column(name = "email", unique = true, length = 30, columnDefinition = "VARCHAR(30)")
    private String email;

    @Column(name = "mobile", unique = true, length = 10, nullable = false, columnDefinition = "CHAR(10)")
    private String mobile;

    @Column(name = "password", unique = true)
    private String password;

    @Column(name = "avatar_url")
    private String avatarUrl;

    @Column(name = "last_login")
    private String lastLogin;

    @Column(name = "status")
    private boolean status;

    @Column(name = "note")
    private String note;
}
