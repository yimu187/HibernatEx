package com.northeaster.hibernatex.core.dao;

import com.northeaster.hibernatex.core.common.BaseDao;
import com.northeaster.hibernatex.core.entity.Employee;

/**
 * Created by MURAT YILMAZ on 4/16/2016.
 */
public class EmployeeDao extends BaseDao<Employee> {

    public EmployeeDao() {
        super(Employee.class);
    }
}
