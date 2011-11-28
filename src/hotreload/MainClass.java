package hotreload;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 5. 20.
 * 
 * @see http://tutorials.jenkov.com/java-reflection/dynamic-class-loading-reloading.html
 */
public class MainClass {
	public static void main(String[] args){

	    ClassLoader classLoader = MainClass.class.getClassLoader();

	    try {
	        Class<?> aClass = classLoader.loadClass("hotreload.MyClass");
	        System.out.println("aClass.getName() = " + aClass.getName());
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	}
}
