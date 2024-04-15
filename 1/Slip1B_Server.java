import java.awt.event.*;
import java.awt.*;
import java.net.*;
import java.io.*;

class Slip1B_Server extends Frame implements ActionListener
{
	static TextField t1=new TextField(20);
	static Button b1=new Button("Send");
	static TextArea ta=new TextArea(5,20);
	static DataOutputStream dos;
	static DataInputStream dis;
	static ServerSocket st;
	static Socket s;
	static String r;
	Slip1B_Server()
	{
		setLayout(new FlowLayout());
		add(t1);add(b1);add(ta);
		b1.addActionListener(this);		
		setVisible(true);
		setSize(300,300);
	}
	public void actionPerformed(ActionEvent e)
	{
		String cmd=e.getActionCommand();
		if(cmd.equalsIgnoreCase("send"))
		{
			try
			{
			r=t1.getText();
			dos.writeUTF(r);
			}
			catch(Exception p)
			{
			}
		}
	}
	public static void main(String[] d ) throws IOException
	{
		new Slip1B_Server();
		
		st=new ServerSocket(1281);	
		s=st.accept();
		dos=new DataOutputStream(s.getOutputStream());
		dis=new DataInputStream(s.getInputStream());
		while(true)
		{
			r=dis.readUTF();
			ta.append("client:"+r+"\n");
		}
	}
	
}