package com.northeaster.hibernatex.core.service;

import com.northeaster.hibernatex.core.common.BaseService;
import com.northeaster.hibernatex.core.dao.CompanyEmployerDao;
import com.northeaster.hibernatex.core.entity.CompanyEmployer;

/**
 * Created by MURAT YILMAZ on 4/16/2016.
 */
public class CompanyEmployerService extends BaseService<CompanyEmployer, CompanyEmployerDao> {

    public CompanyEmployerService() {
        super(CompanyEmployerDao.class);
    }
}
