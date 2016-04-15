package com.northeaster.hibernatex.core.entity;

import com.northeaster.hibernatex.core.common.BaseEntity;
import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.Index;

import javax.persistence.*;

/**
 * Created by MURAT YILMAZ on 4/16/2016.
 */
@Entity
@Table(name = "HIB_EX_EMPLOYEE")
public class Employee implements BaseEntity{

    @SequenceGenerator(name = "generator", sequenceName = "HIB_EX_EMPLOYEE_ID_SEQ")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "generator")
    @Column
    private Long id;

    @Column(length = 50)
    private String employeeName;

    @Column(length = 500)
    private String employeeAddress;

    @Index(name = "IX_HIB_EX_EMPLOYEE_COMPANY")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_HIB_EX_COMPANY")
    @ForeignKey(name = "FK_HIB_EX_EMPLOYEE_COMPANY")
    private Company company;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
