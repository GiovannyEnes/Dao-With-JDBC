package com.giovannyenes.dao;

import com.giovannyenes.entities.Department;
import com.giovannyenes.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller department);
    void update(Seller department);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}
