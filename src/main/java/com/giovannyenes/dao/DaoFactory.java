package com.giovannyenes.dao;

import com.giovannyenes.dao.impl.SellerDaoJDBC;
import com.giovannyenes.db.DB;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
}
