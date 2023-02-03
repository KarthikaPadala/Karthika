package com.example.demo.model.merchant.business;

import com.eventshop.model.merchant.iam.MerchantUser;
import com.eventshop.model.merchant.service.ServiceType;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Model class for hold entity values of business of merchant
 */
@Data
@Table(name="business")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Business  {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "business_entity")
    private String name;

    @Column(name = "status")
    private String status;

    @Column(name = "identifier")
    private String identifier;

    @Column(name = "service_name")
    private String serviceName;

    @Column(name = "fein")
    private String fein;

    @Column(name = "address")
    private String address;

    @Column(name = "owner_name")
    private String ownerName;

    @Column(name = "owner_phone")
    private String ownerPhone;

    @Column(name = "owner_email")
    private String ownerEmail;

    @Column(name = "website")
    private String website;

    @Column(name = "business_service_area")
    private String businessServiceArea;

    @Column(name ="created_on",nullable = true)
    private Timestamp createdOn;

    @Column(name ="updated_on",nullable = true)
    private Timestamp updatedOn;

    @ManyToOne
    @JoinColumn(name = "merchant_user_id", nullable = false)
    private MerchantUser merchantUser;

    @ManyToOne
    @JoinColumn(name = "service_types_id", nullable = false)
    private ServiceType serviceType;

    @Column(name ="created_on_pt",nullable = true)
    private Timestamp createdOnPt;

    @Column(name ="updated_on_pt",nullable = true)
    private Timestamp updatedOnPt;

    @Column(name ="created_by",nullable = false)
    private Long createdBy;

    @Column(name ="updated_by",nullable = false)
    private Long updatedBy;

}