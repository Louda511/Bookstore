/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectprototype;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author compa
 */
public class Connec {
   private  final String user = "root";
   private  final String password = "";
   private  static Connection c;
   private  final String add ="jdbc:mysql://localhost/libraryproject";
   private  final String add2 ="jdbc:mysql://localhost/libraryproject";

   
   public Connection connect (){
        try{
        c=DriverManager.getConnection(add2,user,password);
        System.out.println("Connection Established");
        }
        catch (SQLException ee){
            
            ee.getMessage();
        }
        return c;
   }
    
   public Connection connectUsers (){
        try{
        c=DriverManager.getConnection(add2,user,password);
        System.out.println("Connection Established");
        }
        catch (SQLException ee){
            
            ee.getMessage();
        }
        return c;
   }
}
