package com.example.demo.model.merchant.menu;

import com.eventshop.model.merchant.business.Business;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Model class to track business menu
 */
@Data
@Table(name = "menu")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Menu {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "identifier", nullable = false)
    private String identifier;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "image_identifier")
    private String imageIdentifier;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name ="created_on_pt",nullable = true)
    private Timestamp createdOnPt;

    @Column(name ="updated_on_pt",nullable = true)
    private Timestamp updatedOnPt;

    @ManyToOne
    @JoinColumn(name = "menu_section_id")
    private MenuSection menuSection;

    @ManyToOne
    @JoinColumn(name = "business_id")
    private Business business;

    @Column(name ="created_on",nullable = true)
    private Timestamp createdOn;

    @Column(name ="updated_on",nullable = true)
    private Timestamp updatedOn;

    @Column(name ="created_by",nullable = false)
    private Long createdBy;

    @Column(name ="updated_by",nullable = false)
    private Long updatedBy;

}
