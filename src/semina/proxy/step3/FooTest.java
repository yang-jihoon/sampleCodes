package semina.proxy.step3;

import java.lang.reflect.Proxy;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 2. 23.
 *
 */
public class FooTest {
	private static void print(Foo foo) {

		foo.setName("pungjoo");
		foo.setAddress("pegasus");

		System.out.println(foo.getName() + " / " + foo.getAddress());
		}

		public static void main(String[] args) {

		Foo foo = (Foo) Proxy.newProxyInstance(
		Foo.class.getClassLoader(), new Class[] { Foo.class },
		new FooProxyHandler() );

		print(foo);

		}

}
