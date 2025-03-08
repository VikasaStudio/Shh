package com.vikasa.shh_be.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Thought> thoughts;

    @Column(name = "secret", nullable = false, columnDefinition = "VARCHAR(10)")
    private String secret;

    @Column(name = "sex", nullable = false)
    private String sex;

    @Column(name = "age", nullable = false)
    private byte age;

    @Column(columnDefinition = "DOUBLE PRECISION")
    private BigDecimal latitude;

    @Column(columnDefinition = "DOUBLE PRECISION")
    private BigDecimal longitude;

    @Column(nullable = false)
    private Boolean isActive = true;

    @CreationTimestamp
    @Column(updatable = false)
    private ZonedDateTime createdAt;

    @UpdateTimestamp
    @Column
    private ZonedDateTime updatedAt;
}
