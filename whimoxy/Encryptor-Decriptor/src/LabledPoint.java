import java.awt.*;
public class LabledPoint extends java.awt.Point {
	
	private String text;
	public LabledPoint(int x,int y,String text)
	{
	super(x,y);
	this.text=text;
	
	}
	public void draw(Graphics g)
	{
		g.drawOval(super.x, super.y, 10, 10);
		g.drawString(text, super.x, super.y);
	}
}
