package semina.proxy.step5;

import semina.proxy.step5.Foo;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 2. 23.
 *
 */
public class EduProxyTest {
	public static void main(String[] args) throws IllegalArgumentException, InstantiationException,
	IllegalAccessException, ClassNotFoundException {

		EduProxyManager.register("Foo", "semina.proxy.step5.ExtFooImpl");

		Foo foo = (Foo) EduProxyManager.getService("Foo");

		print(foo);

	}

	private static void print(Foo foo) {

		foo.setName("yongseok");
		foo.setAddress("nowon");

		System.out.println(foo.getName() + " / " + foo.getAddress());

	}
}
