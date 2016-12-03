package com.firstapp.dao.impl;

import com.firstapp.beans.Emp;
import com.firstapp.dao.EmpDao;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by ritomar on 11/29/16.
 */
public class EmpImplDao implements EmpDao, InitializingBean {
    @Autowired
    private DataSource dataSource;

    public void afterPropertiesSet() throws Exception {
        if (dataSource == null) {
            throw new BeanCreationException("Must set dataSource on EmpDao");
        }
    }

    public List<Emp> findAll(){
        return null;
    }
    public List<Emp> findByFirstName(String firstName){
        return null;
    }
    public void insert(Emp contact){}
    public void update(Emp contact){}
    public void delete(Long contactId){}
}
