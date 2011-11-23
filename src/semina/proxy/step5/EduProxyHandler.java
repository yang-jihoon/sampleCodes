package semina.proxy.step5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 2. 23.
 *
 */
public class EduProxyHandler implements InvocationHandler {

	private Object obj = null;

	private EduProxyHandler(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		long time = System.currentTimeMillis();

		try {
			System.out.println(">> " + method.toGenericString() + " start : " + new Date());

			return method.invoke(obj, args);

		} finally {

			System.out.println(">> " + method.toGenericString() + " end   : " +
					(System.currentTimeMillis() - time) + "ms");

		}
	}

	public static Object newInstance(Object obj) throws IllegalArgumentException{

		return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
				obj.getClass().getInterfaces(), new EduProxyHandler(obj));

	}

}
