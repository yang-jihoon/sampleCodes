package semina.toString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2010. 8. 23.
 *
 */
public class Test {
	
	public static void main(String[] args) {
		User jang = new User();
		jang.setName("장용석");
		jang.setRegstNum(111111);
		
		List<User> userList = new ArrayList<User>();
		userList.add(jang);
		
		User jang2 = new User();
		jang2.setName("장용석");
		jang2.setRegstNum(111111);
		
		System.out.println(userList.contains(jang2));
	}
}
