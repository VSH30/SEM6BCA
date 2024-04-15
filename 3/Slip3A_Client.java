import java.io.*;
import java.net.*;
import java.util.*;
class Slip3A_Client
{
   public static void main(String args[])throws Exception
   {
      try
      {
         Socket sc=new Socket("localhost",1003);
         DataInputStream in=new DataInputStream(sc.getInputStream());
         DataOutputStream out=new DataOutputStream(sc.getOutputStream());
         Scanner s=new Scanner(System.in);
         System.out.println("Enter Number:");
         int n=s.nextInt();
         out.writeUTF(""+n);
         String ans=in.readUTF();
         System.out.println(ans);
      } 
      catch(Exception e){}
   }
}