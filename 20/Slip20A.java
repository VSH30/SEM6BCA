import java.sql.*;

public class Slip20A {
    public static void main(String[] args) throws Exception{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignments","root","mysql@db");
		int eno = Integer.parseInt(args[0]);
        Statement stm = conn.createStatement();

        stm.execute("DELETE FROM Employee WHERE eno="+eno);

        System.out.println("DELETED Employee with eno = "+eno);
    }    
}
