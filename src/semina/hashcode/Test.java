package semina.hashcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author need4spd, need4spd@cplanet.co.kr
 * 
 * @date 2009. 12. 2.
 * 
 * 
 */

public class Test {

	public static void main(String[] args) {

		User user1 = new User("111");
		User user2 = new User("111");

		System.out.println(user1.equals(user2)); // ����?

		List<User> userList = new ArrayList<User>();
		userList.add(user1);

		System.out.println(userList.contains(user2)); // ����?

		Map<User, Integer> userScoreMap = new HashMap<User, Integer>();
		userScoreMap.put(user1, 100);
		userScoreMap.put(user2, 100);

		System.out.println(userScoreMap.size()); // ����?

		Map<String, Integer> userNameScoreMap = new HashMap<String, Integer>();
		userNameScoreMap.put("장용석", 100);
		userNameScoreMap.put("양지훈", 100);

		System.out.println(userNameScoreMap.size()); // ����?

		// Set<User> userSet = new TreeSet<User>();
		// userSet.add(user1);
		// userSet.add(user2);
		// System.out.println(userSet.size());
	}
}
