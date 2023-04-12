/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9.mainClasses;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ArrayList;
import projectprototype.Connec;


public class Reader {
    // Date fields
    static Statement ss;
    static Connection c;
    static ResultSet r;
    int id;
    private String username;
    private String mail;
    private String password;
        private String phoneNumber;
        private String library;
            public static ArrayList<Reader> list = new  ArrayList();



    

   

    // public parameterized constructor
    public Reader(int id, String username, String mail, String password, String phoneNumber, String library) {
        this.id=id;
        this.username = username;
        this.mail = mail;
        this.password = password;
        
        this.phoneNumber = phoneNumber;
        this.library=library;

    }
    



    public int getId() {
        return id;
    }



    // methods

    // setter and getter for username
    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    // setter and getter for mail
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    
    // setter and getter for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // setter and getter of phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


     public static ArrayList<Reader> getReaders() {
        try {
           Connec c1 = new Connec ();
            c = c1.connect();
            ss = c.createStatement();
            String query = "select * from signup";
            r = ss.executeQuery(query);

         
            while (r.next()) {
                list.add(new Reader(
                        r.getInt("id"),
                        r.getString("userName"),
                        r.getString("email"),
                        r.getString("password"),
                        r.getString("phoneNumber"),
                        r.getString("library")));
            }
            ss.close();
            c.close();
        } catch (SQLException e) {
            System.out.println("Failed to Establish connection: " + e.getMessage());
        }

        return list;
    }

    @Override
    public String toString() {
        return "Reader{" + "id=" + id + ", username=" + username + ", mail=" + mail + ", password=" + password + ", phoneNumber=" + phoneNumber + ", library=" + library + '}';
    }
     

        }

