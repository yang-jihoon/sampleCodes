package semina.proxy.step3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 2. 23.
 *
 */
public class FooProxyHandler implements InvocationHandler {
	private Map<String, Object> datas = new HashMap<String, Object>();

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		//System.out.println("proxy : " + proxy.getClass().getName());
		
		String methodName = method.getName();

		if (methodName.startsWith("set")) {
			datas.put(methodName.substring(3), args[0]);
		} else if (methodName.startsWith("get") && !methodName.equals("getClass")) {
			return datas.get(methodName.substring(3));
		}

		return null;
	}

}
