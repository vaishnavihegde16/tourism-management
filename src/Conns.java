
import java.sql.*;
public class Conns {
    Statement stmt;
    Connection c;
    public Conns(){  
        try{  
        Class.forName("com.mysql.cj.jdbc.Driver");  
        c=DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmanagementsystem","root","1234");  
        //here tms is database name, root is username and password  
        stmt=c.createStatement();
        }catch(Exception e){
            //
        }
    
}
}
