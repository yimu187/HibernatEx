package com.northeaster.hibernatex.core.common;

import com.northeaster.hibernatex.core.util.HibernateUtils;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by MURAT YILMAZ on 4/16/2016.
 */
public class BaseDao<T extends BaseEntity > {

    private final Class<T> clazz;

    public BaseDao(Class<T> clazz) {
        this.clazz = clazz;
    }

    public Session getCurrentSession(){
        return HibernateUtils.getSessionFactory().getCurrentSession();
    }

    public T save(T entity){
        return (T)getCurrentSession().merge(entity);
    }

    public void delete(T entity){
        getCurrentSession().delete(entity);
    }

    public T findById(Long id){
        return (T)getCurrentSession().get(clazz, id);
    }

    public List<T> findAll(){
        return getCurrentSession().createCriteria(clazz).list();
    }
}
