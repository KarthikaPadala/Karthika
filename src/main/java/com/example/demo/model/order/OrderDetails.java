package com.example.demo.model.order;

import com.eventshop.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Model class for hold entity values for  OrderDetails
 */
@Data
@Entity
@Table(name="order_details")
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private Long id;

    @Column(name="identifier",nullable = false)
    private String identifier;

   // @Column(name="total",nullable = true)
    //private String total;

    @Column(name = "created_on",nullable = false)
    private Timestamp createdOn;

    @Column(name = "updated_on",nullable = true)
    private Timestamp updatedOn;

    @ManyToOne
    @JoinColumn(name = "users_id", nullable = false)
    private User user;

    @Column(name = "created_on_pt",nullable = false)
    private Timestamp createdOnPt;

    @Column(name = "updated_on_pt",nullable = true)
    private Timestamp updatedOnPt;

    @Column(name = "created_by",nullable = false)
    private Long createdBy;

    @Column(name = "updated_by",nullable = false)
    private Long updatedBy;


}
