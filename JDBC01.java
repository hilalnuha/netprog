import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class JDBC01 {
 
    public static final String DATABASE_NAME="dbNetPro";
    public static final String DATABASE_URL="jdbc:mysql://localhost:3306/"+DATABASE_NAME;
    public static final String DATABASE_USERNAME="root";
    public static final String DATABASE_PASS="";
    public static final String DRIVER_PACKAGE="com.mysql.jdbc.Driver";
    public static final int DRIVER_WAY=1;
    public static final String QUERY_SELECT="select noInduk, nilai, nama from mahasiswa";
public static final String QUERY_INSERT="INSERT INTO `mahasiswa` ( `nama`, `nilai`, `alamat` ) VALUES ('Andi','60', 'Jakarta');";
    public static final String QUERY_UPDATE="UPDATE `mahasiswa` SET `nilai` = '50' WHERE `nama` ='Andi';";
    public static final String QUERY_DELETE="DELETE FROM `mahasiswa` WHERE `nama` ='Andi';";
    public static final String QUERY_CREATE="CREATE TABLE MyProduct"+
" (p_id INTEGER,"+"p_name VARCHAR(25),"+"rate FLOAT,"+"unit_msr CHAR(6))";
    public static final String QUERY_DROP="DROP TABLE MyProduct";
    public static final String QUERY_ADDCOLUMN="ALTER TABLE `mahasiswa` ADD `hobi` VARCHAR( 20 ) NOT NULL AFTER `alamat` ";
    public static final String QUERY_DELETECOLUMN="ALTER TABLE `mahasiswa` DROP `hobi`";
   
   
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
    	ResultSet resultSet=statement.executeQuery(QUERY_SELECT);
    	while (resultSet.next()){
        	System.out.println(" terdapat nama "+resultSet.getString("nama"));        	
    	}
    	
    	//b. untuk mengupdate/menambah data dengan pada tabel update/insert/delete gunakan method Statement.executeUpdate()
    	int rowAdded=statement.executeUpdate(QUERY_INSERT);
     	System.out.println(rowAdded+" baris telah ditambah");
     	//untuk mengubah
    	int rowChanged=statement.executeUpdate(QUERY_UPDATE);
      	System.out.println(rowChanged+" baris telah berubah");
      	//untuk menghapus
    	int rowDeleted=statement.executeUpdate(QUERY_DELETE); 
    	System.out.println(rowDeleted+" baris telah dihapus");
    	
    	//c. untuk mengubah properti tabel termasuk membuat dan menghapus tabel bisa digunakan method Statement.execute()
    	boolean gagalTambahKolom=statement.execute(QUERY_ADDCOLUMN);
    	if (!gagalTambahKolom){
        	System.out.println(" Kolom telah ditambah");
    	} else {
        	System.out.println(" Kolom gagal ditambah");
    	}
    	
 
    	boolean gagalHapusKolom=statement.execute(QUERY_DELETECOLUMN);
    	if (!gagalHapusKolom){
        	System.out.println(" Kolom telah dihapus");
    	} else {
        	System.out.println(" Kolom gagal dihapus");
    	}
    	
    	boolean gagalTambahTabel=statement.execute(QUERY_CREATE);
    	if (!gagalTambahTabel){
        	System.out.println(" tabel telah ditambah");
    	} else {
        	System.out.println(" tabel gagal ditambah");
    	}
    	
    	boolean gagalHapusTabel=statement.execute(QUERY_DROP);
    	if (!gagalTambahTabel){
        	System.out.println(" tabel telah dihapus");
    	} else {
        	System.out.println(" tabel gagal dihapus");
    	}
    }
   
   
}
