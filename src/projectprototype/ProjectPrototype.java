/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectprototype;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;

public class ProjectPrototype {
   
    public static void main(String[] args) {
       // Manger.getBooks();
      //  System.out.println(Manger.countArrayList());
      //  Manger.showArrayList();
        System.out.println(Manger.search("y", Manger.getBooks()).size());
    }
}