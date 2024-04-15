import java.io.*;
import java.net.*;
import java.util.*;
class Slip3A_Server
{
   public static void main(String args[])throws Exception
   {
      try 
      {
         int i;
         ServerSocket ss=new ServerSocket(1003);
         System.out.println("Server created...");
         Socket sc=ss.accept();
         DataInputStream in=new DataInputStream(sc.getInputStream());
         DataOutputStream out=new DataOutputStream(sc.getOutputStream());

         String s=in.readUTF();
         int n=Integer.parseInt(s);
         for(i=2;i<n;i++)
         {
           if(n%i==0)
           break; 
         }
         if(i==n)
           out.writeUTF("Prime");
         else
           out.writeUTF("Not Prime");
      }
      catch(Exception e){}
   }
}