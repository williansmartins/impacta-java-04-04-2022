package capitulo_18;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Notice, do not import com.mysql.jdbc.*
// or you will have problems!

public class LoadDriver {
    public static void main(String[] args) {
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver").();
            
            Connection conn = null;
            try {
                conn =
                   DriverManager.getConnection("jdbc:mysql://localhost/test?" +
                                               "user=root&password=password");

                // Do something with the Connection
                System.out.println("Conectado!");
            } catch (SQLException ex) {
                // handle any errors
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        	System.out.println(ex.getMessage());
        }
    }
}