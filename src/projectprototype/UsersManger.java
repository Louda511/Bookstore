/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectprototype;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.*;
import java.util.StringTokenizer;  

/**
 *
 * @author compa
 */
public class UsersManger {
     
     static String query = "select * from book";
     static String queryUsers = "select * from signup";

      static Statement ss;
      static Connection c;
      static ResultSet r;
      static ArrayList<Users> list1 = new  ArrayList<Users>();
      

       public static ArrayList<Users> getUser() {
       try{
       
      
       Connec c1 = new Connec ();
       c = c1.connectUsers();
       ss = c.createStatement();
       r=ss.executeQuery(queryUsers);
            while (r.next()) {
                list1.add(new Users(
                        r.getInt("id"),
                        r.getString("userName"),
                        r.getString("email"),
                        r.getString("password"),
                        r.getInt("phoneNumber"),
                        r.getString("library")
                ));
            }
            ss.close();
             c.close();
             r.close();
        } catch (SQLException e) {
            System.out.println("Failed to Establish connection: " + e.getMessage());
        }

        return list1;
    }
public static void writeToLibrary(int userId,String insert){
      
      
      String userQuery = "UPDATE signup SET library = ? where id = ?";
      
      
      try{
       Connec c1 = new Connec ();
       c = c1.connectUsers();
       ss = c.createStatement();
       
       PreparedStatement preparedStmt = c.prepareStatement(userQuery);
       preparedStmt.setString   (1, insert);
       preparedStmt.setInt(2, userId);
       preparedStmt.executeUpdate();  
       
        ss.close();
        c.close();
        preparedStmt.close();
      }
      catch(SQLException ee){
          ee.getMessage();
      }
}

public static ArrayList<Integer> displayBooks(int userId) {
    ArrayList<Integer> books = new ArrayList<Integer>();
    String userBooks=getUser().get(userId-1).getLibrary();
    StringTokenizer bookIdArrayList = new StringTokenizer(userBooks,",");  
    while (bookIdArrayList.hasMoreTokens()){
    books.add(Integer.parseInt(bookIdArrayList.nextToken()));
    }
    return books;
}

public static boolean checkBookStock(int bookId){
    if(Manger.getBooks().get(bookId-1).getCount()>0){
        return true;
    }
    else {
        return false;
    }
    
}
public static void changeCount (int bookId){
    int count;
    count = Manger.getBooks().get(bookId-1).getCount();
    count--;
    String userQuery = " UPDATE signup SET booknum = ? where id = ?";
      
      
      try{
       Connec c1 = new Connec ();
       c = c1.connect();
       ss = c.createStatement();
       
       PreparedStatement preparedStmt = c.prepareStatement(userQuery);
       preparedStmt.setInt   (1, count);
       preparedStmt.setInt(2, bookId);
       preparedStmt.executeUpdate();  
          System.out.println(count);
          System.out.println(Manger.getBooks().get(bookId-1).getCount());
        ss.close();
        c.close();
        preparedStmt.close();
      }
      catch(SQLException ee){
          ee.getMessage();
      }
    
      
}
public static void addBookCount (int bookId){
    int count;
    count = Manger.getBooks().get(bookId-1).getCount();
    count++;
    String userQuery = " UPDATE book SET booknum = ? where id = ?";
      
      
      try{
       Connec c1 = new Connec ();
       c = c1.connect();
       ss = c.createStatement();
       
       PreparedStatement preparedStmt = c.prepareStatement(userQuery);
       preparedStmt.setInt   (1, count);
       preparedStmt.setInt(2, bookId);
       preparedStmt.executeUpdate();  
          System.out.println(count);
          System.out.println(Manger.getBooks().get(bookId-1).getCount());
        ss.close();
        c.close();
        preparedStmt.close();
      }
      catch(SQLException ee){
          ee.getMessage();
      }
    
      
}


public static void deleteBooks(int userId,int bookId){
      String insert;
      int length =UsersManger.getUser().get(userId-1).getLibrary().length();
      String lib=UsersManger.getUser().get(userId-1).getLibrary();
      String userQuery = "UPDATE signup SET library = ? where id = ?";
      
      if (lib.startsWith(String.valueOf(bookId))&&(length==1||length==2)){
          insert = "";
          
      }
    /*  
      if (lib.startsWith(String.valueOf(bookId))){
          insert = lib.substring(2,length);
      }
*/
      else if (UsersManger.getUser().get(userId-1).getLibrary().endsWith(String.valueOf(bookId))){
          insert = UsersManger.getUser().get(userId-1).getLibrary().substring(0,UsersManger.getUser().get(userId-1).getLibrary().length()-2);
      }
      else {
          String  rep =String.valueOf(bookId)+',';
          insert = UsersManger.getUser().get(userId-1).getLibrary().replace(rep, "");
      }
      try{
       Connec c1 = new Connec ();
       c = c1.connectUsers();
       ss = c.createStatement();
       
       PreparedStatement preparedStmt = c.prepareStatement(userQuery);
       preparedStmt.setString   (1, insert);
       preparedStmt.setInt(2, userId);
       preparedStmt.executeUpdate();  
       
        ss.close();
        c.close();
        preparedStmt.close();
      }
      catch(SQLException ee){
          ee.getMessage();
      }
}

}

