package com.northeaster.hibernatex.core.service;

import com.northeaster.hibernatex.core.common.BaseService;
import com.northeaster.hibernatex.core.dao.EmployeeDao;
import com.northeaster.hibernatex.core.entity.Employee;

/**
 * Created by MURAT YILMAZ on 4/16/2016.
 */
public class EmployeeService extends BaseService<Employee, EmployeeDao> {

    public EmployeeService() {
        super(EmployeeDao.class);
    }
}
