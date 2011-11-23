package semina.spi;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2010. 2. 11.
 *
 */
public class Services {
	private Services() {}
	
	private static final Map<String,Provider> providers = new ConcurrentHashMap<String,Provider>();
	public static final String DEFAULT_PROVIDER_NAME = "def";
	
	//registerDriver
	public static void registerDefaultPrivider(Provider p) {
		registerProvider(DEFAULT_PROVIDER_NAME, p);
	}
	
	public static void registerProvider(String name, Provider p) {
		providers.put(name,p);
	}
	
	//getConnection
	public static Service newInstance() {
		return newInstance(DEFAULT_PROVIDER_NAME);
	}
	
	public static Service newInstance(String name) {
		Provider p = providers.get(name);
		if(p==null) 
			throw new IllegalArgumentException();
	 return p.newService();
	}
}
