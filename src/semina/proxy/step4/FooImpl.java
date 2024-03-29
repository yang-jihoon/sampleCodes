package semina.proxy.step4;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 2. 23.
 *
 */
public class FooImpl implements Foo {

	private String name;
	private String address;

	@Override
	public String getAddress() {
		
		System.out.println("get address in FooImpl");
		
		return address;
	}

	@Override
	public String getName() {
		
		System.out.println("get name in FooImpl");
		
		return name;
	}

	@Override
	public void setAddress(String address) {
		
		System.out.println("set address in FooImpl");
		this.address = address;
	}

	@Override
	public void setName(String name) {
		
		System.out.println("set name in FooImpl");
		this.name = name;
	}
}
