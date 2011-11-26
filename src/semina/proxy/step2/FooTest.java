package semina.proxy.step2;


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

		Foo foo = new Foo() {

			private String name;
			private String address;

			@Override
			public String getAddress() {
				return address;
			}

			@Override
			public String getName() {
				return name;
			}

			@Override
			public void setAddress(String address) {
				this.address = address;
			}

			@Override
			public void setName(String name) {
				this.name = name;
			}

		};

		print(foo);
	}

}
