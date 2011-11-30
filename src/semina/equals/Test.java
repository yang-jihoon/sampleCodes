package semina.equals;

import java.util.ArrayList;
import java.util.List;

import semina.toString.User;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2010. 8. 23.
 *
 */
public class Test {
	
	public static void main(String[] args) {
		User jang = new User();
		jang.setRegstNum(1111);
		
		User jang2 = new User();
		jang.setRegstNum(1111);
		
		System.out.println(jang == jang2);
		
		System.out.println(jang.equals(jang2));
		
		List<User> userList = new ArrayList<User>();
		userList.add(jang);
		
		System.out.println(userList.contains(jang2));
	}
}
