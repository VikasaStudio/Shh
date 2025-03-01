package com.vikasa.shh_be.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.ArrayList;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @OneToMany
    @JoinColumn(name = "thought_id", nullable = false)
    private ArrayList<Thought> thoughts;

    @Column(name = "secret", nullable = false)
    private String secret;

    @Column(name = "sex", nullable = false)
    private String sex;

    @Column(name = "age", nullable = false)
    private byte age;

    @Column(columnDefinition = "DOUBLE PRECISION")
    private BigDecimal latitude;

    @Column(columnDefinition = "DOUBLE PRECISION")
    private BigDecimal longitude;

    @Column
    private Boolean isActive;

    @CreationTimestamp
    @Column(updatable = false) // Prevents updating
    private ZonedDateTime createdAt;

    @UpdateTimestamp
    @Column
    private ZonedDateTime updatedAt;
}
