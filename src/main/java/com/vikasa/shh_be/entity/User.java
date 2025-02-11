package com.vikasa.shh_be.entity;

import jakarta.persistence.*;
import lombok.*;

@Data()
@Entity()
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "secret", nullable = false)
    private String secret;

    @Column(name = "sex", nullable = false)
    private String sex;

    @Column(name = "age", nullable = false)
    private byte age;

    @Override
    public String toString() {
        return String.format("{%d - %s - %s - %s - %d }", id, username, secret, sex, age);
    }
}
