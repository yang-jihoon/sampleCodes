package semina.spi;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2010. 2. 19.
 *
 */
public class DriverManager {
	private DriverManager() {}
	
	private static final Map<String,Driver> drivers = new ConcurrentHashMap<String,Driver>();
	public static final String DEFAULT_PROVIDER_NAME = "default";
	
	//������ ��� registerDriver
	public static void registerDefaultPrivider(Driver d) {
		System.out.println("Driver regist");
		registerDriver(DEFAULT_PROVIDER_NAME, d);
	}
	
	public static void registerDriver(String name, Driver d) {
		drivers.put(name,d);
	}
	
	//���� ���� getConnection
	public static Connection getConnection() {
		return getConnection(DEFAULT_PROVIDER_NAME);
	}
	
	public static Connection getConnection(String name) {
		Driver d = drivers.get(name);
		if(d==null) 
			throw new IllegalArgumentException();
	 return d.getConnection();
	}
	
}
