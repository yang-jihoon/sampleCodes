package hotreload;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 5. 20.
 *
 */
public class TestMyClassLoader {
	public static void main(String[] args) throws
	ClassNotFoundException,
	IllegalAccessException,
	InstantiationException, InterruptedException {

		ClassLoader parentClassLoader = MyClassLoader.class.getClassLoader();
		MyClassLoader classLoader = new MyClassLoader(parentClassLoader);
		Class<?> myObjectClass = classLoader.loadClass("hotreload.MyClass");

		MyClassInterface       object1 =
				(MyClassInterface) myObjectClass.newInstance();

		System.out.println(object1.getName());
		

		Thread.sleep(8000);

		//create new class loader so classes can be reloaded.
		classLoader = new MyClassLoader(parentClassLoader);
		myObjectClass = classLoader.loadClass("hotreload.MyClass");

		object1 = (MyClassInterface)myObjectClass.newInstance();
		System.out.println(object1.getName());
	}
}
