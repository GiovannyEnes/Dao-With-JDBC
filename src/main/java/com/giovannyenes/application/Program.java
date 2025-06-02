package com.giovannyenes.application;

import com.giovannyenes.entities.Department;
import com.giovannyenes.entities.Seller;

import java.util.Date;

public class Program {
    public static void main (String[] args) {

        Department obj = new Department(1, "Books");
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000, obj);

        System.out.println(obj);
        System.out.println(seller);



    }
}
