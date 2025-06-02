package com.giovannyenes.application;

import com.giovannyenes.dao.DaoFactory;
import com.giovannyenes.dao.SellerDao;
import com.giovannyenes.entities.Seller;

public class Program {
    public static void main (String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);



    }
}
