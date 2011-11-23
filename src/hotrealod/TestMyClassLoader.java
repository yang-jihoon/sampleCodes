package hotrealod;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 5. 20.
 *
 */
public class TestMyClassLoader {
	private Log logger = LogFactory.getLog(TestMyClassLoader.class);
	public static void main(String[] args) throws
    ClassNotFoundException,
    IllegalAccessException,
    InstantiationException, InterruptedException {

    ClassLoader parentClassLoader = MyClassLoader.class.getClassLoader();
    MyClassLoader classLoader = new MyClassLoader(parentClassLoader);
    Class myObjectClass = classLoader.loadClass("semina.hotreload.MyClass");

    MyClassInterface       object1 =
            (MyClassInterface) myObjectClass.newInstance();

System.out.println(object1.getName());
MyClassInterface object2 =
            (MyClassInterface) myObjectClass.newInstance();

    Thread.sleep(5000);
    
    //create new class loader so classes can be reloaded.
    classLoader = new MyClassLoader(parentClassLoader);
    myObjectClass = classLoader.loadClass("semina.hotreload.MyClass");

    object1 = (MyClassInterface)       myObjectClass.newInstance();
    System.out.println(object1.getName());
    object2 = (MyClassInterface) myObjectClass.newInstance();
    
}
}
