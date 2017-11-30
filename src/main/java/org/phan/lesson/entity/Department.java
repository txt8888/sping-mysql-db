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
 * Created by SMahabo1 on 5/10/2017.
 * <p>
 * test / learn code
 */
@Entity
@Table(name = "department")
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "department_id")
    @JsonProperty("department_id")
    private Long department_id;

    @Column(name = "department_name")
    @JsonProperty("department_name")
    private String department_name;
}
