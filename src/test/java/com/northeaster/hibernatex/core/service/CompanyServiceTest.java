package com.northeaster.hibernatex.core.service;

import com.northeaster.hibernatex.core.entity.Company;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by MURAT YILMAZ on 4/16/2016.
 */
public class CompanyServiceTest {

    @Test
    public void test(){
        CompanyService companyService = new CompanyService();

        Company company = new Company();
        company.setCompanyName("Test Şirketi");
        company.setCompanyAddress("Test Şirketi Adres");

        company = companyService.save(company);
        Assert.assertTrue(company.getId() != null);
    }
}
