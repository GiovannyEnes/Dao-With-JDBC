package com.giovannyenes.application;

import com.giovannyenes.dao.DaoFactory;
import com.giovannyenes.dao.SellerDao;
import com.giovannyenes.entities.Department;
import com.giovannyenes.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

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

        System.out.println("=== Test 5: seller Update ===");
        seller = sellerDao.findById(2);
        seller.setName("Marta Waine");
        sellerDao.update(seller);
        System.out.println("Updated completed");

        System.out.println("=== Test 6: seller Delete ===");
        System.out.println("Inserted id for deleted seller: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Deleted completed");



        sc.close();
    }
}
