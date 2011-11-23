package hotrealod;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 5. 20.
 *
 */
public class MainClass {
	public static void main(String[] args){

	    ClassLoader classLoader = MainClass.class.getClassLoader();

	    try {
	        Class aClass = classLoader.loadClass("semina.hotreload.MyClass");
	        System.out.println("aClass.getName() = " + aClass.getName());
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	}
}
