package compositeFactory;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends BaseShape {
	public int width;
    public int height;
    
	public Rectangle(int x, int y, Color color, int width, int height) {
		super(x, y, color);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawRect(x, y, getWidth() - 1, getHeight() - 1);
    }
}
