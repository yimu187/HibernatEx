package com.northeaster.hibernatex.core.entity;

import com.northeaster.hibernatex.core.common.BaseEntity;

import javax.persistence.*;

/**
 * Created by MURAT YILMAZ on 4/16/2016.
 */
@Entity
@Table(name = "HIB_EX_EMPLOYER")
public class Employer implements BaseEntity{

    @SequenceGenerator(name = "generator", sequenceName = "HIB_EX_EMPLOYER_ID_SEQ")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "generator")
    @Column
    private Long id;

    @Column(length = 50)
    private String employerName;

    @Column(length = 500)
    private String employerAddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getEmployerAddress() {
        return employerAddress;
    }

    public void setEmployerAddress(String employerAddress) {
        this.employerAddress = employerAddress;
    }
}
