package org.phan.lesson.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by tphan27 on 11/30/2017.
 */
@Entity
@Table(name = "office")
@Data
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "office_id")
    @JsonProperty("office_id")
    private Long office_id;

    @Column(name = "office_name")
    @JsonProperty("office_name")
    private String office_name;
}