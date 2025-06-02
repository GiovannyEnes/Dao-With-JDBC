package com.giovannyenes.application;

import com.giovannyenes.dao.DaoFactory;
import com.giovannyenes.dao.SellerDao;
import com.giovannyenes.dao.impl.SellerDaoJDBC;
import com.giovannyenes.entities.Department;
import com.giovannyenes.entities.Seller;

import java.util.Date;

public class Program {
    public static void main (String[] args) {

        Department obj = new Department(1, "Books");
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000, obj);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(obj);
        System.out.println(seller);



    }
}
