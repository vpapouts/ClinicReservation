import java.sql.*;

public class SQL_Query_in_Oracle2 {
    
    static String     driverClassName = "oracle.jdbc.OracleDriver" ;
    static String     url = "jdbc:oracle:thin:@192.168.6.21:1521:dblabs" ;
    static Connection dbConnection = null;
    static String     username = "it144172";
    static String     passwd = "j@3teJi3";
    static Statement  statement = null;
    static ResultSet rs = null;
    
    public static void main (String[] argv) throws Exception
    {
        Class.forName (driverClassName);
        dbConnection = DriverManager.getConnection (url, username, passwd);
        
        statement = dbConnection.createStatement();
        
        String selectString = "SELECT A.onoma, A.epwnymo\n" +
                              "FROM Kratisi K INNER JOIN Asthenis A ON K.IDAstheni=A.IDAstheni\n" +
                              "INNER JOIN Giatros G ON K.IDGiatrou=G.IDGiatrou\n" +
                              "WHERE G.eidikothta='Οφθαλμίατρος'";
        rs = statement.executeQuery(selectString);

        System.out.println("Onoma      Epwnymo " );
	while(rs.next()) {
		String name = rs.getString("Onoma");
                String surname = rs.getString("Epwnymo");
		System.out.println( name + "    " + surname );
	}

        statement.close();
        dbConnection.close();
    }
    
}
