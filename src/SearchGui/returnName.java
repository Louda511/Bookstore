/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SearchGui;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author abdoa
 */
public class returnName {
     static Statement ss;
      static Connection c;
      static ResultSet r;
      static String search;
    
    public static String Name;
    public static int returnid(String Name)
    {
        int idd=0;
//       try{
//            Connec c1 = new Connec ();
//          c = c1.connect();
//          ss = c.createStatement();
//           search="select * from book";
//           while(r.next())
//           {  idd++;
//               if(Name.equals(r.getString("name")))
//               {
//                  
//                   return r.getInt("id");
//                  
//                   
//               }
//           
//           }

for (int i = 0 ; i<Manger.countArrayList();i++)
        try{
            
         if((Manger.getBooks().get(i).getName().toLowerCase().contains(Name))){
             return Manger.getBooks().get(i).getId();
         }
           
       }
       catch(Exception b)
       {
           System.out.println(b.getMessage());
       }
        
        System.out.println("77777777   " + idd);
        return idd;
        
        
    }
    
}
