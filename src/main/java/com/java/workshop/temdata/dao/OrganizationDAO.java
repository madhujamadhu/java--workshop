package com.java.workshop.temdata.dao;
import com.java.workshop.temdata.basic.bean.Organaization;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;



public class OrganizationDAO {
    public void createTable(Connection dbConnection){
        try{
            Class.forName("org.h2.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try(Statement statement=dbConnection.createStatement()){
            statement.execute("""
                    create table organization(
                        id int AUTO_INCREMENT PRIMARY KEY,
                        NAME VARCHAR(100),
                        WEBSITE VARCHAR(100),
                        EMAIL VARCHAR(100),
                        CONTACT_NUMBER VARCHAR(100),
                        REGISTRATION_NO INT,
                        DESCRIPTION VARCHAR(255))
                    """);
        }catch(SQLException e){
            System.out.println("error create table:"+e.getMessage());
        }
    }
    public int save(Connection dbConnection,Organaization organization) {
        try(PreparedStatement preparedStatement=dbConnection.prepareStatement("""
                INSERT INTO organization(name,website,email,contact_number,registration_no,DESCRIPTION) VALUES(?,?,?,?,?,?)
                """)){
                    preparedStatement.setString(1,organization.name());
                    preparedStatement.setString(2,organization.website());
                    preparedStatement.setString(3,organization.email());
                    preparedStatement.setString(4,organization.contact_number());
                    preparedStatement.setInt(5,organization.registration_number());
                    preparedStatement.setString(6,organization.description());
                    preparedStatement.executeUpdate();

                }catch(SQLException e){
                    System.out.println(e.getMessage());
                    return 0;
                }
        return 0;
    }
    public Organaization findByName(Connection dbConnection,String name){
        Organaization organaization=null;
        try(PreparedStatement preparedStatement=dbConnection.prepareStatement("""
                SELECT * FROM organization WHERE name=?
                """)){
            preparedStatement.setString(1, name);
            ResultSet resultset=preparedStatement.executeQuery();
            if(resultset!=null && resultset.next()){
                organaization=new Organaization(
                    resultset.getString("name"),
                    resultset.getString("description"),
                    resultset.getString("website"),
                    resultset.getString("email"),
                    resultset.getString("contact_number"),
                    resultset.getInt("registration_no"));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return organaization;
    }
}


