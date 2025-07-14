package com.java.workshop.temdata;

import com.java.workshop.temdata.dao.OrganizationDAO;

public class JDBCExample {
    public static void main(String[] args) {
        OrganizationDAO organizationDAO=new OrganizationDAO();
        organizationDAO.createTable();
    }
    
}
