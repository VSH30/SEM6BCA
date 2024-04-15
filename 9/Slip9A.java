import java.sql.*;
import java.util.Scanner;

public class Slip9A {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignments","root","mysql@db");

        Statement stm = conn.createStatement();

        stm.execute("CREATE TABLE emp(eno INT,ename VARCHAR,sal INT);");
        System.out.println("Tables Created!!!");

        PreparedStatement pstm = conn.prepareStatement("INSER INTO emp VALUES(?,?,?)");
        System.out.print("Enter ENO: ");
        pstm.setInt(1, sc.nextInt());
        System.out.println("Enter ENAME: ");
        pstm.setString(2, sc.nextLine());
        System.out.println("Entfr SAL: ");
        pstm.setInt(3, sc.nextInt());

        if(1==pstm.executeUpdate())
            System.out.println("RECORD INSERTED!!!");
        else
            System.out.println("FAILED TO INSERT!!!");
    }    
}
