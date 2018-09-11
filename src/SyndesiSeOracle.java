import java.sql.*;

public class SyndesiSeOracle {
    
    static String     driverClassName = "oracle.jdbc.OracleDriver" ;
    static String     url = "jdbc:oracle:thin:@192.168.6.21:1521:dblabs" ;
    static Connection dbConnection = null;
    static String     username = "it144172";
    static String     passwd = "j@3teJi3";
    
    public static void main (String[] argv) throws Exception
    {
        Class.forName (driverClassName);
        dbConnection = DriverManager.getConnection (url, username, passwd);
        dbConnection.close();
    }
    
}
