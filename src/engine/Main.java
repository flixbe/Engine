package engine;

import java.awt.event.KeyEvent;

import engine.core.graphics.Color;
import engine.core.graphics.Display;
import engine.core.graphics.Renderer;
import engine.core.graphics.Window;
import engine.core.input.Keyboard;

public class Main {

	private boolean running = false;
	
	private Renderer renderer;
	private Display display;
	private Window window;
	
	public Main() {
		window = new Window();
		display = new Display(window);
		renderer = new Renderer(window.getWindowWidth(), window.getWindowHeight());
		window.addKeyListener(new Keyboard());
	}
	
	public void run() {
		running = true;
		
		while (running) {
			update();
			render();
		}
	}
	
	public void update() {
		if (Keyboard.isKeyPressed(KeyEvent.VK_W) || Keyboard.isKeyPressed(KeyEvent.VK_UP)) System.out.println("UP");
		if (Keyboard.isKeyPressed(KeyEvent.VK_D) || Keyboard.isKeyPressed(KeyEvent.VK_RIGHT)) System.out.println("RIGHT");
		if (Keyboard.isKeyPressed(KeyEvent.VK_S) || Keyboard.isKeyPressed(KeyEvent.VK_DOWN)) System.out.println("DOWN");
		if (Keyboard.isKeyPressed(KeyEvent.VK_A) || Keyboard.isKeyPressed(KeyEvent.VK_LEFT)) System.out.println("LEFT"); 
	}
	
	public void render() {
		renderer.render(Color.GREEN);
		display.drawImage(renderer.getImage());
		display.showImage();
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
}