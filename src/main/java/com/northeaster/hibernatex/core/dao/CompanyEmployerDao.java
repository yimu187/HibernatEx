package com.northeaster.hibernatex.core.dao;

import com.northeaster.hibernatex.core.common.BaseDao;
import com.northeaster.hibernatex.core.entity.Company;
import com.northeaster.hibernatex.core.entity.CompanyEmployer;

/**
 * Created by MURAT YILMAZ on 4/16/2016.
 */
public class CompanyEmployerDao extends BaseDao<CompanyEmployer> {

    public CompanyEmployerDao() {
        super(CompanyEmployer.class);
    }
}
