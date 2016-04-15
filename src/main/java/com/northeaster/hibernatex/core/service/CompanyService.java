package com.northeaster.hibernatex.core.service;

import com.northeaster.hibernatex.core.common.BaseService;
import com.northeaster.hibernatex.core.dao.CompanyDao;
import com.northeaster.hibernatex.core.entity.Company;

/**
 * Created by MURAT YILMAZ on 4/16/2016.
 */
public class CompanyService extends BaseService<Company, CompanyDao> {

    public CompanyService() {
        super(CompanyDao.class);
    }


}
