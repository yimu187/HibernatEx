package com.northeaster.hibernatex.core.service;

import com.northeaster.hibernatex.core.common.BaseService;
import com.northeaster.hibernatex.core.dao.EmployerDao;
import com.northeaster.hibernatex.core.entity.Employer;

/**
 * Created by MURAT YILMAZ on 4/16/2016.
 */
public class EmployerService extends BaseService<Employer, EmployerDao> {

    public EmployerService() {
        super(EmployerDao.class);
    }
}
