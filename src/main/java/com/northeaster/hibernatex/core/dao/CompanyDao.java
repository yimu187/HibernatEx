package com.northeaster.hibernatex.core.dao;

import com.northeaster.hibernatex.core.common.BaseDao;
import com.northeaster.hibernatex.core.entity.Company;
import com.northeaster.hibernatex.core.util.HibernateUtils;

/**
 * Created by MURAT YILMAZ on 4/16/2016.
 */
public class CompanyDao extends BaseDao<Company>{

    public CompanyDao() {
        super(Company.class);
    }
}
