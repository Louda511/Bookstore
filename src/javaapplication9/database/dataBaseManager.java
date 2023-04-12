/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javaapplication9.mainClasses.Reader;
import projectprototype.Connec;

/**
 *
 * @author abdoa
 */
public class dataBaseManager {
            static Statement ss;
            static Connection c;
            static ResultSet r;
            private static Connection connection;
            
            
            
            public static int getUsersCount() {
        try {
            Connec c1 = new Connec ();
            c = c1.connect();
            ss = c.createStatement();
            String query = "select * from signup";
            r = ss.executeQuery(query);
            int c=1;
           while (r.next())
           {
           r.getInt("id");
           c++;
           } connection.close();

           return c;

            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;
    }

    //true if avalible
    public static boolean checkUser(String username) {
        try {
             Connec c1 = new Connec ();
             c = c1.connect();
             ss = c.createStatement();
            String query = "select * from signup";
             r = ss.executeQuery(query);
            ArrayList <String> x = new ArrayList();
            while(r.next()){
                x.add(r.getString("userName")) ;
            
            }
            System.out.println(x.get(0));
            System.out.println(username);
            for (int i=0; i < x.size();i++)
            {if (username.equals(x.get(i)))
                return false;
                
                }
            ss.close();
            c.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
public static boolean verifyUser(String username , String password) {
        try {
            Connec c1 = new Connec ();
             c = c1.connect();
             ss = c.createStatement();
             String query = "select * from signup";
             r = ss.executeQuery(query);
            ArrayList <String> x = new ArrayList();
            while(r.next()){
                x.add(r.getString("userName")) ;
            
            }
            System.out.println(x.get(0));
            System.out.println(username);
            for (int i=0; i < x.size();i++)
            {if (username.equals(x.get(i)))
                return false;
                
                }
            ss.close();
            c.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    
     public static void addUser(Reader user) {
        Connection connection = null;
        try {
            Connec c1 = new Connec ();
             c = c1.connect();
             ss = c.createStatement();
        
            String query = "insert into `signup` (`id`, `userName`, `email`, `password`," +
                    "   `phoneNumber`)" +
                    " VALUES ('"
                    + getUsersCount()
                    + "','" + user.getUserName()
                    + "','" + user.getMail()
                    + "','" + user.getPassword()
                    
                   // + "','" + user.getMoney()
                    + "','" + user.getPhoneNumber()
                    //+ "','" + user.getLibrarystring()
                    + "')";
            ss.execute(query);
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void updateUser(Reader user) {

        String query = "UPDATE signup SET username = '" + user.getUserName()
                + "', email =         '" + user.getMail()
                + "', phonenumber =   '" + user.getPhoneNumber()
               
                + "', password =      '" + user.getPassword()
              //  + "', money =         '" + user.getMoney()
                //+ "', library =       '" + user.getLibrarystring()
                + "' where id=         " + user.getId();

        try {
            Connec c1 = new Connec ();
             c = c1.connect();
             ss = c.createStatement();
             r = ss.executeQuery(query);
            ss.execute(query);
            System.out.println(query);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
       
            
        }

    
}
