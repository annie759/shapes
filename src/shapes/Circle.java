package shapes;

import java.awt.*;

public class Circle extends Shape {
	private int x;
	private int y;
	private int radius;
	private Color color;
	
	public Circle(int x, int y, int radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.color = new Color(000);
	}

	@Override
	public void setColor(int rgb) {
		this.color = new Color(rgb);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		g.drawOval(x-radius, y-radius, radius*2, radius*2);
	}
}
