package com.example.demo.model.merchant.iam;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Model class for hold entity values of MerchantUser
 */

@Entity
@Table(name = "MerchantUser")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MerchantUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "email_verified")
    private Boolean emailVerified;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "mobile_verified")
    private Boolean mobileVerified;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

    @Column(name = "business_name")
    private String businessName;

    @Column(name = "identifier")
    private String identifier;

    @Column(name = "status")
    private String status;

    @Column(name = "reset_token")
    private String resetToken;

    @Column(name = "terms")
    private Boolean terms;

    @Column(name ="created_on",nullable = false)
    private Timestamp createdOn;

    @Column(name ="updated_on",nullable = false)
    private Timestamp updatedOn;


    @Column(name ="created_on_pt",nullable = false)
    private Timestamp createdOnPt;

    @Column(name ="updated_on_pt",nullable = false)
    private Timestamp updatedOnPt;

    @Column(name ="created_by",nullable = false)
    private Long createdBy;

    @Column(name ="updated_by",nullable = false)
    private Long updatedBy;
}
