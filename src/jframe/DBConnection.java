package jframe;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


/**
 *
 * @author sm200
 */
public class DBConnection {
    static Connection con = null;

        public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Imp_Gen2?autoReconnect=true&useSSL=false","root","Shubham18#");
        } catch(Exception e){
        e.printStackTrace();
        }
        return con;

}
}
