package semina.spi;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2010. 2. 19.
 *
 */
public class MyDriver implements Driver {
	
	private static Driver defaultDriver;
	static {
		defaultDriver = new MyDriver();
		DriverManager.registerDefaultPrivider(defaultDriver);
	}
	
	@Override
	public Connection getConnection() {
		System.out.println("MyDriver's Connection return");
		return null;
	}
}
