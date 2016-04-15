package com.northeaster.hibernatex.core.entity;

import com.northeaster.hibernatex.core.common.BaseEntity;

import javax.persistence.*;

/**
 * Created by MURAT YILMAZ on 4/16/2016.
 */
@Entity
@Table(name = "HIB_EX_COMPANY")
public class Company implements BaseEntity{

    @SequenceGenerator(name = "generator", sequenceName = "HIB_EX_COMPANY_ID_SEQ")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "generator")
    @Column
    private Long id;

    @Column(length = 50)
    private String companyName;

    @Column(length = 500)
    private String companyAddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }
}
