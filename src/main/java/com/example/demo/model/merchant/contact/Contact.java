package com.example.demo.model.merchant.contact;

import com.eventshop.model.merchant.business.Business;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Model class to track contacts of the business
 */
@Data
@Table(name = "contacts")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contact {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "identifier", nullable = false)
    private String identifier;

    @Column(name = "service", nullable = false)
    private String service;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "contact_type", nullable = false)
    private String contactType;

    @Column(name = "is_deleted", nullable = false)
    private Boolean isDeleted;

    @Column(name ="created_on",nullable = false)
    private Timestamp createdOn;

    @Column(name ="updated_on",nullable = true)
    private Timestamp updatedOn;

    @ManyToOne
    @JoinColumn(name = "business_id", nullable = false)
    private Business business;

    @Column(name ="created_on_pt",nullable = true)
    private Timestamp createdOnPt;

    @Column(name ="updated_on_pt",nullable = true)
    private Timestamp updatedOnPt;

    @Column(name ="created_by",nullable = false)
    private Long createdBy;

    @Column(name ="updated_by",nullable = false)
    private Long updatedBy;

}
