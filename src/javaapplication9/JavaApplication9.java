/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author abdoa
 */
public class JavaApplication9 {

    static String user = "root";
    static String password = "";
    static String add = "jdbc:mysql://localhost/abdo";
    static Connection c;
    static Statement ss;
    static String q;
    
    public static void main(String[] args) {
  try{
    c =DriverManager.getConnection(add,user,password);
        
        ss=c.createStatement();
      // q="create table st(id int not null, name varchar(30) not null, sallary int not null, constraint k primary key(id))";
        int id =6;
       String username = "kedo";
       String email ="das";
       String phonenumber = "dsa";
     //  q = "insert into st values ("+id+",'"+name+"',"+sallary+")" ; 
      // q="update st set sallary = 8000 where id = 1 ";
    //  q="delete from st where id >4";
 
    String query = "select* from signup WHERE"
                    + " username= '" + username
                    + "' OR email= '" + email 
                    + "' OR phonenumber='" + phonenumber
                    + "'";
            ResultSet r = ss.executeQuery(query);
            System.out.println(query);
            r.last();
        System.out.println("done:)");
  
  
  
  
  
  }
        catch( SQLException ee){System.out.println(ee);} 
    
     finally {
            try{
            c.close();
            ss.close();}
            catch(SQLException ee){ System.out.println(ee);}
            }
    
    
    }
    
}
