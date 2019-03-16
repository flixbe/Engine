package engine.core.graphics;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

public class Renderer {

	private int width;
	private int height;
	private int[] pixels;
	
	private BufferedImage image;
	
	public Renderer(int width, int height) {
		this.width = width;
		this.height = height;
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		pixels = ((DataBufferInt) image.getRaster().getDataBuffer()).getData();
	}
	
	public void render(Color color) {
		for (int i = 0; i < width * height; i++)
			pixels[i] = color.getColor();
	}
	
	public void clear() {
		render(Color.BLACK);
	}
	
	public int getWidht() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int[] getPixels() {
		return pixels;
	}
	
	public BufferedImage getImage() {
		return image;
	}
	
}