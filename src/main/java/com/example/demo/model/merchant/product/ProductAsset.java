package com.example.demo.model.merchant.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 *Model class for hold entity values for productAsset types of merchant
 */
@Data
@Table(name="product_assets")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductAsset {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "identifier",nullable=false)
    private String identifier;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "asset_identifier", nullable = false)
    private String assetIdentifier;

    @Column(name = "asset_width", nullable = true)
    private Long assetWidth;

    @Column(name = "asset_height", nullable = true)
    private Long assetHeight;

    @Column(name = "order", nullable = true)
    private Long order;

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
    @JoinColumn(name="products_id",nullable = false)
    private Product product;
}
