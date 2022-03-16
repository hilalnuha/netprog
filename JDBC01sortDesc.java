
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class JDBC01sortDesc {
 
    public static final String DATABASE_NAME="dbNetPro";
    public static final String DATABASE_URL="jdbc:mysql://localhost:3306/"+DATABASE_NAME;
    public static final String DATABASE_USERNAME="root";
    public static final String DATABASE_PASS="";
    public static final String DRIVER_PACKAGE="com.mysql.jdbc.Driver";
    public static final int DRIVER_WAY=1;
    public static final String QUERY_SELECT="select noInduk, nilai, nama from mahasiswa";
   
   
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
  
    	//langkah 1 buat driver
    	if (DRIVER_WAY==1){
        	//cara 1
        	Class.forName(DRIVER_PACKAGE);
    	}
    	else if (DRIVER_WAY==2){
        	//cara 2
        	Driver driver=new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
    	}
    	
    	//langkah 2 ambil connection
    	Connection connection=DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASS);
    	
    	//langkah 3 buat statement
    	Statement statement=connection.createStatement();
    	
    	//langkah 4 eksekusi query
        //a. untuk mengambil data dengan query select gunakan method Statement.executeQuery()
    	ResultSet resultSet=statement.executeQuery(QUERY_SELECT + " ORDER BY nama DESC");
    	while (resultSet.next()){
        	System.out.println(" terdapat nama "+resultSet.getString("nama"));        	
    	}
    	
    }     
}
