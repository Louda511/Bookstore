
package cart;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import projectprototype.Connec;

public class Libraryproject {

  static Connection c;
  static Statement s;
  static String modify;
  
    public static void main(String[] args) {
       //connect with data base
       
   
       Connec k=new Connec();
       try{
     c=  k.connect();
 //s=c.createStatement();

   // modify="insert into book values (5,'logic ','helmy','its a good book',45,40,4,'htttp//www.book.com','http//www.book.com')";
 // s.execute(modify);
      
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
}}
