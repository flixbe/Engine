package engine.core.graphics;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Window extends Canvas {

	private String title = "Window";
	private int width = 800;
	private int height = 600;
	private int scale = 1;
	
	private JFrame frame;
	
	private Dimension size = new Dimension(width * scale, height * scale);
	
	public Window() {
		createWindow();
	}
	
	public Window(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
		createWindow();
	}
	
	public void createWindow() {
		frame = new JFrame(title);
		frame.setSize(size);
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		frame.add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void setScale(int scale) {
		this.scale = scale;
	}
	
	public int getWindowWidth() {
		return width;
	}
	
	public int getWindowHeight() {
		return height;
	}
	
}