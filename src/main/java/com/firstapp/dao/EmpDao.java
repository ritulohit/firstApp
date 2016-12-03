package com.firstapp.dao;

import com.firstapp.beans.Emp;

import java.util.List;

/**
 * Created by ritomar on 11/29/16.
 */
public interface EmpDao {
    public List<Emp> findAll();
    public List<Emp> findByFirstName(String firstName);
    public void insert(Emp contact);
    public void update(Emp contact);
    public void delete(Long contactId);
}
