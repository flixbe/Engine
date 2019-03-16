package engine.core.graphics;

public class Color {

	public static final Color BLACK       = new Color(0x000000);
	public static final Color WHITE       = new Color(0xFFFFFF);
	public static final Color RED         = new Color(0xD50000);
	public static final Color PINK        = new Color(0xC51162);
	public static final Color PURPLE      = new Color(0xAA00FF);
	public static final Color DEEP_PURPLE = new Color(0x6200EA);
	public static final Color INDIGO      = new Color(0x304FFE);
	public static final Color BLUE        = new Color(0x2962FF);
	public static final Color LIGHT_BLUE  = new Color(0x0091EA);
	public static final Color CYAN        = new Color(0x00B8D4);
	public static final Color TEAL        = new Color(0x00BFA5);
	public static final Color GREEN       = new Color(0x00C853);
	public static final Color LIGHT_GREEN = new Color(0x64DD17);
	public static final Color LIME        = new Color(0xAEEA00);
	public static final Color YELLOW      = new Color(0xFFD600);
	public static final Color AMBER       = new Color(0xFFAB00);
	public static final Color ORANGE      = new Color(0xFF6D00);
	public static final Color DEEP_ORANGE = new Color(0xDD2C00);
	public static final Color BROWN       = new Color(0x3E2723);
	public static final Color GRAY        = new Color(0x212121);
	public static final Color BLUE_GRAY  = new Color(0x263238);
	
	private int color;
	
	public Color(int hex) {
		this.color = hex;
	}
	
	public Color(int r, int g, int b) {
		this.color = getHex(r, g, b);
	}
	
	public static int[] getRGB(int hex) {
		int r = (hex & 0xFF0000) >> 16;
		int g = (hex & 0xFF00) >> 8;
		int b = (hex & 0xFF);
		return new int[] { r, g, b };
	}
	
	public static int[] getRGBA(int hex) {
		int a = (hex & 0xFF000000) >> 24;
		int r = (hex & 0xFF0000) >> 16;
		int g = (hex & 0xFF00) >> 8;
		int b = (hex & 0xFF);
		return new int[] { r, g, b, a };		
	}
	
	public static int getHex(int r, int g, int b) {
		return r << 16 | g << 8 << b;
	}
	
	public static int getHex(int r, int g, int b, int a) {
		return a << 24 | r << 16 | g << 8 | b;
	}
	
	public int getColor() {
		return color;
	}
	
}