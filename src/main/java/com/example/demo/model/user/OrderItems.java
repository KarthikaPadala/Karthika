package com.example.demo.model.user;

import com.eventshop.model.merchant.product.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Model class for hold entity values for Users OrderItems
 */
@Data
@Entity
@Table(name="order_items")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private Long id;

    @Column(name="identifier",nullable = false)
    private String identifier;

    @Column(name = "created_on",nullable = false)
    private Timestamp createdOn;

    @Column(name = "updated_on",nullable = true)
    private Timestamp updatedOn;

    @ManyToOne
    @JoinColumn(name = "products_id", nullable = false)
    private Product product;

    @Column(name = "created_on_pt",nullable = false)
    private Timestamp createdOnPt;

    @Column(name = "updated_on_pt",nullable = true)
    private Timestamp updatedOnPt;

    @Column(name = "created_by",nullable = false)
    private Long createdBy;

    @Column(name = "updated_by",nullable = false)
    private Long updatedBy;

}
