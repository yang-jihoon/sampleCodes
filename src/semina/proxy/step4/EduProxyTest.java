package semina.proxy.step4;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 2. 23.
 *
 */
public class EduProxyTest {
	private static void print(Foo foo) {

		foo.setName("yongseok");
		foo.setAddress("nowon");

		System.out.println(foo.getName() + " / " + foo.getAddress());

	}

	public static void main(String[] args) {

		Foo foo = (Foo) EduProxyHandler.newInstance(new ExtFooImpl());

		print(foo);

	}

}
