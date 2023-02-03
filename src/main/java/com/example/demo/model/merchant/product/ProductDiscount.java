package com.example.demo.model.merchant.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Model class for hold entity values for Product Discount
 */

@Data
@Table(name="product_discount")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDiscount {
    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "identifier",nullable=false)
    private String identifier;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "is_active", nullable = true)
    private Boolean isActive;

    @Column(name ="created_on",nullable = false)
    private Timestamp createdOn;

    @Column(name ="updated_on",nullable = true)
    private Timestamp updatedOn;

    @Column(name="deleted_on",nullable = true)
    private Timestamp deletedOn;

    @ManyToOne
    @JoinColumn(name="products_id",nullable = false)
    private Product product;

    @Column(name ="created_on_pt",nullable = false)
    private Timestamp createdOnPt;

    @Column(name ="updated_on_pt",nullable = true)
    private Timestamp updatedOnPt;

    @Column(name ="created_by",nullable = false)
    private Long createdBy;

    @Column(name ="updated_by",nullable = false)
    private Long updatedBy;
}
