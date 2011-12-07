package semina.mybatis;

import java.lang.reflect.Proxy;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 7. 9.
 *
 */
public class MapperFactory {

	public static UserDataMapper getMapper(Class<UserDataMapper> clazz) {
		return (UserDataMapper)Proxy.newProxyInstance(clazz.getClassLoader(),
				new Class[] { clazz }, new MapperProxyHandler());
	}

//	Generic의 사용
//	@SuppressWarnings("unchecked")  
//	public  <T> T getMapper(Class<T> clazz) {  
//		return (T)Proxy.newProxyInstance(clazz.getClassLoader(),  
//				new Class[] { clazz }, new MapperProxyHandler());  
//	}  
}

