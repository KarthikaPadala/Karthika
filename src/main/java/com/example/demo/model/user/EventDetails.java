package com.example.demo.model.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Model class for hold entity values for Users EventDetails
 */
@Data
@Entity
@Table(name="event_details")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EventDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private Long id;

    @Column(name="identifier",nullable = false)
    private String identifier;

    @Column(name="date",nullable = true)
    private Long date;

    @Column(name="start_time",nullable = true)
    private String startTime;

    @Column(name="end_time",nullable = true)
    private String endTime;

    @Column(name="location",nullable = true)
    private String location;

    @Column(name ="created_on",nullable = false)
    private Timestamp createdOn;

    @Column(name ="updated_on",nullable = true)
    private Timestamp updatedOn;

    @ManyToOne
    @JoinColumn(name = "users_id", nullable = false)
    private User user;

    @Column(name ="created_on_pt",nullable = false)
    private Timestamp createdOnPt;

    @Column(name ="updated_on_pt",nullable = true)
    private Timestamp updatedOnPt;

    @Column(name ="created_by",nullable = false)
    private Long createdBy;

    @Column(name ="updated_by",nullable = false)
    private Long updatedBy;

}
