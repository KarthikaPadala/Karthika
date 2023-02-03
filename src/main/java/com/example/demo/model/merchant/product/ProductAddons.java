package com.example.demo.model.merchant.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;


@Data
@Table(name = "product_addons")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ProductAddons {

        @Id
        @Column(name = "id", nullable = false)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name="identifier", nullable = false)
        private String identifier;

        @Column(name = "title", nullable = false)
        private String title;

        @Column(name = "description", nullable = false)
        private String description;

        @Column(name = "price", nullable = false)
        private Long price;

        @Column(name = "is_quantity_allowed", nullable = false)
        private Boolean isQuantityAllowed;

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
        @JoinColumn(name = "product_id", nullable = false)
        private Product product;

    }


