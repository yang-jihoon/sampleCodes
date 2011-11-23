package semina.proxy.step5;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 2. 23.
 *
 */
public class ExtFooImpl extends FooImpl implements Foo {

	@Override
	public void setName(String name) {

	try {

	java.util.Random random = new java.util.Random();

	int sleep = random.nextInt(1000);

	Thread.sleep(sleep);

	} catch (InterruptedException e) {
	}

	super.setName(name);

	}

}
