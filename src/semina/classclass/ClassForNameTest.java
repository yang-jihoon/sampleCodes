package semina.classclass;

import java.lang.reflect.Method;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2010. 8. 23.
 *
 */
public class ClassForNameTest {
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> clazz = Class.forName("java.lang.String");
		
		System.out.println("class name : " + clazz.getName());
		
		Method[] methods = clazz.getDeclaredMethods();
		
		for(Method method : methods) {
			System.out.println("method : " + method.getName() + "modifier : " + method.getModifiers() + "return type : " + method.getReturnType());
		}
	}

}
