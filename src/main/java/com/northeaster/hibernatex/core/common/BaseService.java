package com.northeaster.hibernatex.core.common;

import org.hibernate.criterion.Order;

import java.util.List;

/**
 * Created by MURAT YILMAZ on 4/16/2016.
 */
public abstract class BaseService  <T extends BaseEntity, Q extends BaseDao<T>> {


    private Class<Q> daoClazz;

    private Q dao;

    public BaseService(Class<Q> daoClazz){
        this.daoClazz = daoClazz;
        try {
            dao = (Q)Class.forName(daoClazz.getName()).newInstance();
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public Q getDao() {
        return dao;
    }

    public T findById(long id) {
        return dao.findById(id);
    }

    public List<T> findAll() {
        return dao.findAll();
    }

    public T save(T e) {
        return dao.save(e);
    }

    public void delete(T e) {
        dao.delete(e);
    }



}
