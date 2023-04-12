package libraryproject;

import SignIn.register;
import java.sql.Connection;
import java.sql.Statement;

public class Libraryproject {

    static Connection c ;
    static Statement s1 ;
    static String query ;
    
    public static void main(String[] args) {
        register a = new register();
        a.setVisible(true);
    }
}
    
    

