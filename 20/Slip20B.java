import java.applet.*;
import java.awt.*;
/* <APPLET     code= "Slip20B.class"  width= "1000" height= "1000">
     </APPLET> */
public class Slip20B extends Applet implements Runnable
{
	
	public void init()
	{
	Thread s=new Thread(this);
	s.start();
	}
	
	public void run()
	{
	repaint();
	}
	
	public void paint(Graphics g)
	{
	g.drawLine(400,100,400,300);
	g.drawRect(400,100,100,100);
	g.drawLine(400,300,100,500);
	g.drawLine(400,300,700,500);
	g.drawRect(100,500,600,300);
	g.drawRect(350,700,100,100);
	}
}
