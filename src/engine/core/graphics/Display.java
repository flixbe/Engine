package engine.core.graphics;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Display {

	private Window window;
	private Graphics g;
	private BufferStrategy bs;
	
	public Display(Window window) {
		this.window = window;
		window.createBufferStrategy(3);
		bs = window.getBufferStrategy();
		g = bs.getDrawGraphics();
	}
	
	public void createBS(int buffers) {
		window.createBufferStrategy(buffers);
	}
	
	public void drawImage(BufferedImage image) {
		g = bs.getDrawGraphics();
		g.drawImage(image, 0, 0, window.getWindowWidth(), window.getWindowHeight(), null);
	}
	
	public void showImage() {
		g.dispose();
		bs.show();
	}
	
}