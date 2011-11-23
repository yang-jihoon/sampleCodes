package semina.equals;

import java.awt.Color;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2010. 8. 24.
 *
 */
public class ColorPoint_New {
	
	private Point point;
	private Color color;
	
	public ColorPoint_New(int x, int y, Color color) {
		point = new Point(x, y);
		this.color = color;
	}
	
	public Point getPoint() {
		return point;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof ColorPoint_New))
			return false;
		
		ColorPoint_New cp = (ColorPoint_New)o;
		
		return cp.point.equals(point) && cp.color.equals(color);
	}

}
