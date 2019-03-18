package engine.core.math;

public class Vector2i {

	private int x, y;
	
	public Vector2i() {
		set(x, y);
	}
	
	public Vector2i(int x, int y) {
		set(x, y);
	}
	
	public Vector2i(Vector2i vector) {
		set(vector.x, vector.y);
	}
	
	public Vector2i add(Vector2i vector) {
		this.x += vector.x;
		this.y += vector.y;
		return this;
	}
	
	public Vector2i add(int value) {
		this.x += value;
		this.y += value;
		return this;
	}
	
	public Vector2i subtract(Vector2i vector) {
		this.x -= vector.x;
		this.y -= vector.y;
		return this;
	}
	
	public Vector2i subtract(int value) {
		this.x -= value;
		this.y -= value;
		return this;
	}
	
	public Vector2i multiply(Vector2i vector) {
		this.x *= vector.x;
		this.y *= vector.y;
		return this;
	}
	
	public Vector2i multiply(int value) {
		this.x *= value;
		this.y *= value;
		return this;
	}
	
	public Vector2i divide(Vector2i vector) {
		this.x /= vector.x;
		this.y /= vector.y;
		return this;
	}
	
	public Vector2i divide(int value) {
		this.x /= value;
		this.y /= value;
		return this;
	}
	
	public static double getDistance(Vector2i v0, Vector2i v1) {
		double x = v0.getX() - v1.getX();
		double y = v0.getY() - v1.getY();
		return Math.sqrt(x * x + y * y);
	}
	
	public boolean equals(Object object) {
		if (!(object instanceof Vector2i))
			return false;
		
		Vector2i vector = (Vector2i) object;
		
		if (vector.getX() == this.getX() && vector.getY() == this.getY())
			return true;
		
		return false;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}