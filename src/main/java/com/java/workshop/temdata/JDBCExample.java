package com.java.workshop.temdata;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.java.workshop.temdata.basic.bean.Organaization;
import com.java.workshop.temdata.dao.OrganizationDAO;

public class JDBCExample {
    public static void main(String[] args) {
        Connection dbConnection=null;
        try{
            Class.forName("org.h2.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            dbConnection=DriverManager.getConnection("jdbc:h2:mem:tempdataDB","sa",null);
        }catch(SQLException sqlException){
            System.out.println("error connection to databace:"+sqlException.getMessage());
        }
        OrganizationDAO organizationDAO=new OrganizationDAO();
        organizationDAO.createTable(dbConnection);
        Organaization organization=new Organaization("VETIAS",
                                                "Thindal",
                                                "www.vetias.com",
                                                "vetias.ac.in",
                                                "1239856432",
                                                12455645);
        organizationDAO.save(dbConnection,organization );
    }

    
    
}
