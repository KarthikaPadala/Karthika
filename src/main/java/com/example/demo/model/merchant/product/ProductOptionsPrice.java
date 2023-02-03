package com.example.demo.model.merchant.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;


    /**
     * Model class for hold entity values for Product options Price
     */
    @Data
    @Table(name="productOptionsPrice")
    @Entity
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public class ProductOptionsPrice {
        @Id
        @Column(name = "id", nullable = false)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name="day-number",nullable = true)
        private Long dayNumber;

        @Column(name = "amount",nullable = true)
        private Long amount;

        @Column(name="units",nullable = true)
        private String units;

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

