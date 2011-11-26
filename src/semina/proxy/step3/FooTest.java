package semina.proxy.step3;

import java.lang.reflect.Proxy;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 2. 23.
 *
 */
public class FooTest {
	
	public static void main(String[] args) {
		
		//일반적인 사용
		Foo foo = new FooImpl();
		
		print(foo);

		System.out.println("-------------------------------");
		//FooImpl을 사용
		
		Foo proxyFooFromImpl = (Foo) Proxy.newProxyInstance(
				Foo.class.getClassLoader(), foo.getClass().getInterfaces(),
				new FooProxyHandler() );

		print(proxyFooFromImpl);
		
		System.out.println("-------------------------------");
		
		//Foo 인터페이스와 같은 역할을 하지만 실제로는 Foo의 Proxy 클래스를 넘겨주는 것
		Foo proxyFoo = (Foo) Proxy.newProxyInstance(
				Foo.class.getClassLoader(), new Class[] { Foo.class },
				new FooProxyHandler() );

		print(proxyFoo);

	}
	
	private static void print(Foo foo) {

		foo.setName("yongseok");
		foo.setAddress("nowon");

		System.out.println(foo.getName() + " / " + foo.getAddress());
	}

}
