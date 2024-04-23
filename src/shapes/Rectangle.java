package shapes;

import java.awt.*;

public class Rectangle extends Shape {
	private int x;
	private int y;
	private int width;
	private int height;
	private Color color;
	
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = Color.black;
	}

	@Override
	public void setColor(int rgb) {
		this.color = new Color(rgb);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		g.drawRect(x, y, width, height);
	}


}
