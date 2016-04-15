package com.northeaster.hibernatex.core.entity;

import com.northeaster.hibernatex.core.common.BaseEntity;
import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.Index;

import javax.persistence.*;

/**
 * Created by MURAT YILMAZ on 4/16/2016.
 */
@Entity
@Table(name = "HIB_EX_COMPANY_EMPLOYER")
public class CompanyEmployer implements BaseEntity{

    @SequenceGenerator(name = "generator", sequenceName = "HIB_EX_EMPLOYEE_ID_SEQ")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "generator")
    @Column
    private Long id;

    @Index(name = "IX_HIB_EX_CMPNY_EMPLYR_CMPNY")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_HIB_EX_COMPANY")
    @ForeignKey(name = "IX_HIB_EX_CMPNY_EMPLYR_CMPNY")
    private Company company;

    @Index(name = "IX_HIB_EX_CMPNY_EMPLYR_EMPLYR")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_HIB_EX_EMPLOYER")
    @ForeignKey(name = "FK_HIB_EX_CMPNY_EMPLYR_EMPLYR")
    private Employer employer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
}
