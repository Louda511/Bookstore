
package javaapplication9.mainClasses;




import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javaapplication9.database.DataBaseManipulationType;
import projectprototype.Connec;

public class BooksManager {
      static Statement ss;
      static Connection c;
    static ArrayList<Book> list = new  ArrayList<Book>();

    public static ArrayList<Book> getBooks() {
        try {
            Connec c1 = new Connec ();
            c = c1.connect();
            ss = c.createStatement();

            String query = "select* from books";
            ResultSet r = ss.executeQuery(query);

        
            while (r.next()) {
                list.add(new Book(
                        r.getInt("id"),
                        r.getString("name"),
                        r.getString("description"),
                        r.getInt("count"),
                        r.getDouble("cost"),
                        r.getString("coverurl"),
                        r.getString("downloadurl"),
                        r.getBoolean("hasdiscount"),
                        r.getInt("discount"),
                        r.getBoolean("deleted")));
            }
            ss.close();
            c.close();
        } catch (SQLException e) {
            System.out.println("Failed to Establish connection: " + e.getMessage());
        }

        return list;
    }


    public static void UpdateDatabase(Book book, DataBaseManipulationType a) {
        if (a == DataBaseManipulationType.NEWBOOK) {
            Connection connection = null;
            try {
                Connec c1 = new Connec ();
                c = c1.connect();
                ss = c.createStatement();

                int hasDiscount;
                if (book.hasDiscount())
                    hasDiscount = 1;
                else
                    hasDiscount = 0;
                String query = "INSERT INTO `books` (`id`, `name`, `description`, `count`," +
                        " `cost`, `coverurl`, `downloadurl`, `hasdiscount`, `discount`,`deleted`) VALUES ('" + book.getId() + "','"
                        + book.getName() + "'," + " '" + book.getDescription() + "', '" + book.getCount() +
                        "', '" + book.getCost() + "', '" + book.getCoverurl() + "', '" + book.getDownloadurl()
                        + "', '" + hasDiscount + "', '" + book.getDiscount() + "'," + book.isDeleted() + ")";
                ss.execute(query);
                System.out.println(query);
                ss.close();
                c.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }else

        if (a == DataBaseManipulationType.EDITEDBOOK) {
            Connection connection = null;
            String uri = null;
            try {
                Connec c1 = new Connec ();
                c = c1.connect();
                ss = c.createStatement();
                String query = "select* from books where id=" + book.getId();
                ResultSet r = ss.executeQuery(query);
                r.next();
                uri = r.getString("coverurl");
                ss.close();
                c.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }


            String query = "UPDATE books SET cost = '" + book.getCost()
                    + "', count =        '" + book.getCount()
                    + "', hasdiscount =   " + book.hasDiscount()
                    + " , discount =     '" + book.getDiscount()
                    + "', downloadurl =  '" + book.getDownloadurl()
                    + "', name=          '" + book.getName()
                    + "', description=   '" + book.getDescription();


            try {
                Connec c1 = new Connec ();
                c = c1.connect();
                ss = c.createStatement();
                Book q = list.get(list.size() - 1);
                if (!uri.equals(book.getCoverurl())) {
                    query += "', coverurl =     '" + book.getCoverurl();
                }
                query += "' where id=       " + book.getId();
                ss.execute(query);
                System.out.println(query);
                ss.close();
                c.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        if (a == DataBaseManipulationType.DELETEDBOOK) {
            String query = "UPDATE books SET deleted = true  where id= " + book.getId();
            Connection connection = null;
            try {
                    Connec c1 = new Connec ();
                    c = c1.connect();
                    ss = c.createStatement();
                    Book q = list.get(list.size() - 1);
                    ss.execute(query);
                    System.out.println(query);
                    ss.close();
                    c.close();
                }
             catch (SQLException e) {
                    e.printStackTrace();
                }

        }
    }
    static Book getBookById(int id){
        return list.get(id);
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
