package com.vikasa.shh_be.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.ZonedDateTime;
import java.util.Date;

@Entity
@Table(name="thought_replies")
public class ThoughtReplies {
    @Id
    Long id;

    @ManyToOne
    @JoinColumn(name="parent_thought_id")
    private Thought parentThought;

    @Column
    private String content;

    @CreationTimestamp
    @Column(updatable = false) // Prevents updating
    private ZonedDateTime createdAt;

    @UpdateTimestamp
    @Column
    private ZonedDateTime updatedAt;}
