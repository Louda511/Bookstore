/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectprototype;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication9.mainClasses.Book;


public class Manger {
     static String query = "select * from book";
      static Statement ss;
      static Connection c;
      static ResultSet r;
      static ArrayList<Book> list = new  ArrayList<Book>();
      

       public static ArrayList<Book> getBooks() {
       try{
       
      
       Connec c1 = new Connec ();
       c = c1.connect();
       ss = c.createStatement();
       
       r=ss.executeQuery(query);
       int x=0;
            while (r.next()) {
                list.add(new Book(
                        r.getInt("id"),
                        r.getString("name"),
                        r.getString("auther"),
                        r.getString("description"),
                        r.getInt("cost"),
                        r.getInt("discound"),
                        r.getInt("booknum"),
                        r.getString("url"),
                        r.getString("coverUri")
                        
                     
                ));
                x++;   
            }
                   System.out.println("oooooooooo " + x);    

            ss.close();
             c.close();
             
        } catch (SQLException e) {
            System.out.println("Failed to Establish connection: " + e.getMessage());
        }

        return list;
    }

      
       
          
            public static int countArrayList(){
           
               
            Connec c1 = new Connec ();
       c = c1.connect();
         try {
             ss = c.createStatement();
         } catch (SQLException ex) {
             Logger.getLogger(Manger.class.getName()).log(Level.SEVERE, null, ex);
         }
       
         try {
             r=ss.executeQuery(query);
         } catch (SQLException ex) {
             Logger.getLogger(Manger.class.getName()).log(Level.SEVERE, null, ex);
         }
       int x=0;
         try {
             while (r.next()) {
                 x++;}
         } catch (SQLException ex) {
             Logger.getLogger(Manger.class.getName()).log(Level.SEVERE, null, ex);
         }
            return x;
    }
       
       
       
       
       public static void showArrayList(){
              for(int i=0; i<2;i++){
                System.out.println(list.get(i).getId());
                        
              }
          }
       
       
       
   
       
           
         
     public static ArrayList<Book> search(String name, ArrayList<Book> books){
        ArrayList<Book> found=new ArrayList<Book>();
        for(Book b:books){
            if(b.getName().toLowerCase().contains(name.toLowerCase())){
                found.add(b);
            }
        }
        return found;
    
       }
}

