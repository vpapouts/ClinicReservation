import java.sql.*;

public class SQL_Query_in_Oracle {
    
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
        // Εμφανίστε ονόματα και επίθετα των ατόμων του Προσωπικού
        // τα οποία έχουν θέση Νοσοκόμας
        
        String selectString = "SELECT P.onoma, P.epwnymo " +
                              "FROM Exei E INNER JOIN Giatros G ON E.IDGiatrou=G.IDGiatrou " +
                              "INNER JOIN Proswpiko P ON E.IDProswpikou=P.IDProswpikou " +
                              "WHERE P.thesi='Νοσοκόμα' ";
        rs = statement.executeQuery(selectString);

        System.out.println("Onoma     Epwnymo " );
	while(rs.next()) {
		String name = rs.getString("Onoma");
                String surname = rs.getString("Epwnymo");
		System.out.println( name + "    " + surname );
	}

        statement.close();
        dbConnection.close();
    }
    
}
