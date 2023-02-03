package com.example.demo.model.merchant.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Model class for hold entity values for Product options Details
 */
@Data
@Table(name="productOptionsDetails")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductOptionsDetails {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="key",nullable = false)
    private String key;

    @Column(name = "value",nullable = false)
    private String value;

    @Column(name ="created_on",nullable = true)
    private Timestamp createdOn;

    @Column(name ="updated_on",nullable = true)
    private Timestamp updatedOn;

    @ManyToOne
    @JoinColumn(name = "product_options_id", nullable = false)
    private ProductOptions productOption;

    @Column(name ="created_on_pt",nullable = true)
    private Timestamp createdOnPt;

    @Column(name ="updated_on_pt",nullable = true)
    private Timestamp updatedOnPt;

    @Column(name ="created_by",nullable = false)
    private Long createdBy;

    @Column(name ="updated_by",nullable = false)
    private Long updatedBy;

}
