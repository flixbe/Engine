package engine;

import engine.core.graphics.Color;
import engine.core.graphics.Display;
import engine.core.graphics.Renderer;
import engine.core.graphics.Window;

public class Main {

	private boolean running = false;
	
	private Renderer renderer;
	private Display display;
	private Window window;
	
	public Main() {
		window = new Window();
		display = new Display(window);
		renderer = new Renderer(window.getWindowWidth(), window.getWindowHeight());
	}
	
	public void run() {
		running = true;
		
		while (running) {
			update();
			render();
		}
	}
	
	public void update() {
		
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