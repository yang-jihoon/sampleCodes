package semina.equals;

import java.awt.Color;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2010. 8. 23.
 *
 */
public class Test {
	
	public static void main(String[] args) {
		//��Ī���� ����
		CaseInsensitiveString cis = new CaseInsensitiveString("Jang");
		String s = "jang";
		
		System.out.println(cis.equals(s));
		System.out.println(s.equals(cis));
		
		//���༺�� ���� - 1. ��Ī��
		Point p = new Point(1,2);
		ColorPoint cp = new ColorPoint(1, 2, Color.CYAN);
		
		System.out.println(p.equals(cp));
		System.out.println(cp.equals(p));
		
		//���༺�� ���� 
		ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
		Point p2 = new Point(1,2);
		ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);
		
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		System.out.println(p1.equals(p3));
	}
}
