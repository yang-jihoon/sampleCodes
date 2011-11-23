package semina.equals;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2010. 8. 24.
 *
 */
public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Point)) 
			return false;
		
		Point p = (Point)o;
		return p.x == x && p.y == y;
	}

}
