package javaapplication9.mainClasses;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import projectprototype.Connec;

public class Book {
    private int id;   // primary
    private String name;
    private String description;
    private int count;
    private double cost;
    private double discount;
    private String auther;
    private String url;
    private String coverUri;
    private boolean hasDiscount = false;
    private double discound;
    private int booknum;
    private boolean isdeleted = false;
    private String author;
    
    public boolean isDeleted() {
        return isdeleted;
    }

    public void setIsdeleted(boolean isdeleted) {
        this.isdeleted = isdeleted;
    }
 static Connection c ;
    static Statement s1 ;
    static String query ;

    public Book() {
       
    }
    public Book( String name, String author, String description, int cost, int discound, int booknum, String url, String coverUri) {
        this.id=  this.uni_id();
        this.name = name;
        this.author = author;
        this.description = description;
        this.cost = cost;
        this.discound = discound;
        this.booknum = booknum;
        this.url = url;
        this.coverUri = coverUri;
    }
       
    public Book(int id, String name, String description, int count, double cost, String coverurl, String downloadurl, boolean hasDiscount, double discount, boolean isdeleted) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.count = count;
        this.cost = cost;
        this.coverUri = coverurl;
        this.url = downloadurl;
        this.hasDiscount = hasDiscount;
        this.discount = discount;
        this.isdeleted = isdeleted;
    }
      public Book(int id, String name, String auther, String description, double cost,int discound ,int booknum, String url, String coverUri) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.auther = auther;
        this.cost = cost;
        this.discound = discound;
        this.booknum = booknum;
        this.url=url;
        this.coverUri = coverUri;
        
    }
      
        Book(String text, String text0, String text1, int parseInt, int parseInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Book(int id, String name, String auther, String description, int cost,int discound ,int booknum, String url, String coverUri) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.auther = auther;
        this.cost = cost;
        this.discound = discound;
        this.booknum = booknum;
        this.url=url;
        this.coverUri = coverUri; 
    }
       
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setDownloadurl(String downloadurl) {
        this.url = downloadurl;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCoverurl(String coverurl) {
        this.coverUri = coverurl;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setHasDiscount(boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getCost() {
        return cost;
    }

    public double getFinalCost() {
        int factor;
        if (hasDiscount) {
            factor = 1;
        } else {
            factor = 0;
        }
        return cost - cost * (factor * (discount / 100));
    }

    public String getCoverurl() {
        if (coverUri.charAt(0) == '\"')
            coverUri = coverUri.substring(1, coverUri.length() - 1);
        if (coverUri.charAt(coverUri.length() - 1) == '\"')
            coverUri = coverUri.substring(0, coverUri.length() - 2);
        return coverUri;
    }
  public String getDownloadurl() {
        return url;
    }

    public boolean hasDiscount() {
        return hasDiscount;
    }

    public double getDiscount() {
        return discound;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void decreaseCount() {
        count--;
    }
     public String getCoverUri() {
        return coverUri;
    }
   
    

      
@Override
    public String toString() {
        return "Book{" + "id=" + id + ", name=" + name + ", author=" + auther + ", description=" + description + ", cost=" + cost + ", discound=" + discound + ", booknum=" + booknum + ", url=" + url + ", coverUri=" + coverUri + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.cost != other.cost) {
            return false;
        }
        if (this.discound != other.discound) {
            return false;
        }
        if (this.booknum != other.booknum) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.auther, other.auther)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.url, other.url)) {
            return false;
        }
        return Objects.equals(this.coverUri, other.coverUri);
    }
    private int uni_id(){
        
        Connec c1 = new Connec();
         int counter =1;
        try {
            c=c1.connect();
            query="select * from book ";
            s1 = c .createStatement();
            s1.execute(query);
            ResultSet r = s1.executeQuery(query);
           
            while(r.next()){
                r.getInt("id");
                counter++;
            }
            return counter;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
         try{   
            s1.close();
            c.close();}
           
         catch(SQLException ee){
             System.out.println(ee.getMessage());
         }
        }
        return counter;
        
      
    }
   public void addTOSQL(){
        Connec c2 = new Connec();
        try {
            c=c2.connect();
            query="insert into book values('"+id+"','"+name+"','"+auther+"','"+description+"','"+cost+"','"+discound+"',"
                    + "'"+booknum+"','"+url+"','"+coverUri+"')";
            s1 = c .createStatement();
            s1.execute(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
         try{   
            s1.close();
            c.close();}
         catch(SQLException ee){
             System.out.println(ee.getMessage());
         }
        }
   }
   public static void deleteFromSQL(int id){
        Connec c2 = new Connec();
        try {
            c=c2.connect();
            query="delete from book where id = '"+id+"'";
            s1 = c .createStatement();
            s1.execute(query);
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            
        }
        finally {
         try{   
            s1.close();
            c.close();}
         catch(SQLException ee){
             System.out.println(ee.getMessage());
         }
        }
   }
}
