package com.vikasa.shh_be.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.ZonedDateTime;
import java.util.Date;

@Entity
@Table(name="thought_engagements")
public class ThoughtEngagement {
    @Id
    Long id;

    @JoinColumn(name = "user_id")
    @OneToOne()
    private User userId;

    String engagementType;

    @CreationTimestamp
    @Column(updatable = false) // Prevents updating
    private ZonedDateTime createdAt;

    @UpdateTimestamp
    @Column
    private ZonedDateTime updatedAt;
}
