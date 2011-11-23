package semina.clone;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2010. 5. 15.
 *
 */
public class Test {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Student st = new Student();
		st.setName("��");
		st.setNo(1);
		
		Student st2 = (Student) st.clone();
		
		System.out.println("st2 name : " + st2.getName());
		System.out.println("st2 no : " + st2.getNo());
		
		st2.setName("��");
		
		System.out.println("st2 name : " + st2.getName());
		System.out.println("st name : " +st.getName());
		
		System.out.println(st);
		System.out.println(st2);
	}
}
