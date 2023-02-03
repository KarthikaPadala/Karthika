package com.example.demo.model.merchant.menu;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Model class to track Menu Additional Options of the business menu
 */
@Data
@Table(name = "menu_additional_options")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MenuAdditionalOptions {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "identifier", nullable = false)
    private String identifier;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "status")
    private String status;

    @Column(name ="created_on",nullable = true)
    private Timestamp createdOn;

    @Column(name ="updated_on",nullable = true)
    private Timestamp updatedOn;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

    @Column(name ="created_on_pt",nullable = true)
    private Timestamp createdOnPt;

    @Column(name ="updated_on_pt",nullable = true)
    private Timestamp updatedOnPt;

    @Column(name ="created_by",nullable = false)
    private Long createdBy;

    @Column(name ="updated_by",nullable = false)
    private Long updatedBy;


}
