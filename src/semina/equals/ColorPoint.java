package semina.equals;

import java.awt.Color;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2010. 8. 24.
 *
 */
public class ColorPoint extends Point {
	
	private Color color;
	
	public ColorPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof ColorPoint)) {
			return false;
		}
		
		return super.equals(o) && ((ColorPoint)o).color == color;
	}

//	@Override
//	public boolean equals(Object o) {
//		if(!(o instanceof ColorPoint)) {
//			return false;
//		}
//		
//		if(!(o instanceof ColorPoint)) {
//			return o.equals(this);
//		}
//		
//		return super.equals(o) && ((ColorPoint)o).color == color;
//	}
}
