package semina.proxy.step1;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 2. 23.
 *
 */
public class FooImpl implements Foo {

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
}
