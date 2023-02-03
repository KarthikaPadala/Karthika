package com.example.demo.model.merchant.product;

import com.eventshop.model.merchant.business.Business;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
*Model class for hold entity values for product types of merchant
 */

@Data
@Table(name="products")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "identifier",nullable=false)
    private String identifier;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "capacity", nullable = true)
    private String capacity;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "long_description", nullable = false)
    private String longDescription;

    @Column(name = "minimum_booking", nullable = false)
    private Long minimumBooking;

    @Column(name = "minimum_booking_unit", nullable = false)
    private String minimumBookingUnit;

    @Column(name = "is_refund_allowed",nullable=true)
    private Boolean isRefundAllowed;

    @Column(name = "non_refund_deposit_amount",nullable=true)
    private Long nonRefundDepositAmount;

    @Column(name = "refund_deposit_amount",nullable=true)
    private Long refundDepositAmount;

    @Column(name = "is_cancellation_allowed", nullable = true)
    private Boolean isCancellationAllowed;

    @Column(name = "cancellation_description",nullable=true)
    private String cancellationDescription;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name ="created_on",nullable = true)
    private Timestamp createdOn;

    @Column(name ="updated_on",nullable = true)
    private Timestamp updatedOn;

    @Column(name ="created_on_pt",nullable = true)
    private Timestamp createdOnPt;

    @Column(name ="updated_on_pt",nullable = true)
    private Timestamp updatedOnPt;

    @Column(name ="created_by",nullable = false)
    private Long createdBy;

    @Column(name ="updated_by",nullable = false)
    private Long updatedBy;

    @ManyToOne
    @JoinColumn(name = "business_id", nullable = false)
    private Business business;

}
