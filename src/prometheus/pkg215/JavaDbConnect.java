
package prometheus.pkg215;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class JavaDbConnect {
    private static Connection connection=null;
    
    public static Connection databaseConnect(){
        try{
            Class.forName("org.sqlite.JDBC");
            connection=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Acer\\Desktop\\java home examples\\Prometheus-215\\prometheusdb.sqlite");
            return connection;
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        
    }
    
}
