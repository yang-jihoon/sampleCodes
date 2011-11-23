package semina.proxy.step5;

import java.util.HashMap;
import java.util.Map;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 2. 23.
 *
 */
public class EduProxyManager {
	final static private EduProxyManager INSTANCE = new EduProxyManager();

	private Map<String, Object> serviceStore = new HashMap<String, Object>();

	private EduProxyManager(){
	}

	private void register0(String serviceName, String serviceClazz) throws IllegalArgumentException,
	InstantiationException, IllegalAccessException, ClassNotFoundException {

		serviceStore.put(serviceName,
				EduProxyHandler.newInstance(Class.forName(serviceClazz).newInstance()));

	}

	public static void register(String serviceName, String serviceClazz) throws IllegalArgumentException,
	InstantiationException, IllegalAccessException, ClassNotFoundException {

		INSTANCE.register0(serviceName, serviceClazz);

	}

	private Object getService0(String serviceName) {

		return serviceStore.get(serviceName);

	}


	public static Object getService(String serviceName) {

		return INSTANCE.getService0(serviceName);

	}


}
