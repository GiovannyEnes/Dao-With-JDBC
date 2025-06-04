package com.giovannyenes.application;

import com.giovannyenes.dao.DaoFactory;
import com.giovannyenes.dao.SellerDao;
import com.giovannyenes.entities.Department;
import com.giovannyenes.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main (String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== Test 1: seller findById ===");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
        System.out.println("=== Test 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> sellerList = sellerDao.findByDepartment(department);
        for(Seller obj : sellerList){
            System.out.println(obj);
        }

        System.out.println("=== Test 3: seller findAll ===");
        sellerList = sellerDao.findAll();
        for(Seller obj : sellerList){
            System.out.println(obj);
        }

        System.out.println("=== Test 4: seller Insert ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id: " + newSeller.getId());



    }
}
