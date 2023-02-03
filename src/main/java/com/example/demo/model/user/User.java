package com.example.demo.model.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;


/**
 * Model class for hold entity values for Users
 */
@Data
@Entity
@Table(name="user")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="identifier")
    private String identifier;

    @Column(name="name")
    private String name;

    @Column(name="dob")
    private Timestamp dob;

    @Column(name="email")
    private String email;

    @Column(name="email_verified")
    private Boolean emailVerified;

    @Column(name="mobile")
    private String mobile;

    @Column(name="mobile_verified")
    private Boolean mobileVerified;

    @Column(name="password")
    private String password;

    @Column(name="provider")
    private String provider;

    @Column(name="provider_token")
    private String providerToken;

    @Column(name="reset_token")
    private String resetToken;

    @Column(name="terms")
    private Boolean terms;

    @Column(name="status")
    private String status;

    @Column(name="user_Type")
    private String userType;

    @Column(name = "created_on")
    private Timestamp createdOn;

    @Column(name = "modified_on")
    private Timestamp modifiedOn;

    @Column(name="last_login")
    private Timestamp lastLogin;

    @Column(name="notification_type")
    private String notificationType;

    @Column(name ="created_on_pt",nullable = true)
    private Timestamp createdOnPt;

    @Column(name ="updated_on_pt",nullable = true)
    private Timestamp updatedOnPt;

    @Column(name ="created_by",nullable = false)
    private Long createdBy;

    @Column(name ="updated_by",nullable = false)
    private Long updatedBy;

}
