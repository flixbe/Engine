package engine.core.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener{

	private static final boolean[] KEYS = new boolean[1024];

	public static boolean isKeyPressed(int keyCode) {
		return KEYS[keyCode];
	}
	
	public void keyPressed(KeyEvent e) {
		KEYS[e.getKeyCode()] = true;
	}
	
	public void keyReleased(KeyEvent e) {
		KEYS[e.getKeyCode()] = false;
	}
	
	public void keyTyped(KeyEvent e) {

	}
	
}