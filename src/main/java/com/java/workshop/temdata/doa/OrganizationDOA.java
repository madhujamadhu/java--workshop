package com.java.workshop.temdata.doa;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

import org.h2.jdbcx.JdbcDataSource;

public class OrganizationDOA {
    public void createTable(){
        JdbcDataSource h2dDataSource=new JdbcDataSource();
        h2dDataSource.setUrl("jdbc:h2:mem:temdataDB");
        h2dDataSource.setUser("sa");
        try(Connection dbconnection=h2dDataSource.getConnection()){
            Statement statement=dbconnection.createStatement();
            statement.execute("""
                    create table organization(
                        id int AUTO_INCREMENT PRIMARY KEY,
                        NAME VARCHAR(100),
                        WEBSITE VARCHAR(100),
                        EMAIL VARCHAR(100),
                        CONTACT_NUMBER VARCHAR(100),
                        REGISTRATION_NO INT)
                    """);
        }catch(SQLException e){
            System.out.println("error create table:"+e.getMessage());
        }
    }
    
}
