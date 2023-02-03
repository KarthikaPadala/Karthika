package com.example.demo.model.vigilance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Model class for the Flyway schema history
 */

@Data
@Table(name = "flyway_schema_history")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Flyway {
    @Id
    @Column(name = "installed_rank", nullable = false)
    private Long installed_rank;

    @Column(name = "version")
    private String version;

    @Column(name = "description")
    private String description;

    @Column(name = "type")
    private String type;

    @Column(name = "script")
    private String script;

    @Column(name = "checksum")
    private int checksum;

    @Column(name = "installed_by")
    private String installed_by;

    @Column(name = "installed_on")
    private Timestamp installed_on;

    @Column(name = "execution_time")
    private int execution_time;

    @Column(name = "success")
    private int success;



}
