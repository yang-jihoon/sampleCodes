package semina.proxy.step1;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 2. 23.
 *
 */
public class FooTest {

	private static void print(Foo foo) {

		foo.setName("yongseok");
		foo.setAddress("nowon");

		System.out.println(foo.getName() + " / " + foo.getAddress());

		}

		public static void main(String[] args) {

		Foo foo = new FooImpl();

		print(foo);
		}

}
