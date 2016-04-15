package com.northeaster.hibernatex.core.dao;

import com.northeaster.hibernatex.core.common.BaseDao;
import com.northeaster.hibernatex.core.entity.Employer;

/**
 * Created by MURAT YILMAZ on 4/16/2016.
 */
public class EmployerDao extends BaseDao<Employer> {

    public EmployerDao() {
        super(Employer.class);
    }
}
