package semina.testframework.step5;

import java.io.File;
import java.lang.reflect.Method;

public class TestCollector {
		
	public void test() {
		testMethodScanner();
	}
	
	private void testMethodScanner() {
				
		try {
			String baseClassPath = this.getClass().getResource("").toString();
			baseClassPath = baseClassPath.substring(6);

			File files = new File(baseClassPath);

			System.out.println("scan base directory : " + baseClassPath);
			System.out.println("classpath root : " + this.getClass().getResource("/").toString().substring(6));
						
			File[] classList = files.listFiles();
			
			for (File classFile : classList) {
				try {
					
					//System.out.println("classFile.getName() : " + classFile.getCanonicalPath());
					
					String clazzName = classFile.getCanonicalPath().substring(this.getClass().getResource("/").toString().substring(6).length());
					clazzName = clazzName.replace(".class", "");
					clazzName = clazzName.replace("\\", ".");
					
					//System.out.println("clazzName : " + clazzName);
					
					Class<?> clazz = Class.forName(clazzName);
					//Annotation[] annotations = clazz.getAnnotations();
					
					Method[] methods = clazz.getMethods();
					
					for(Method method : methods) {
						
						
						MyTest myTest = method.getAnnotation(MyTest.class);
						
						if(myTest != null) {
							System.out.println("method : " + method.getName());
							
							Object o = method.invoke(clazz.newInstance(), new Object[0]);
							
							System.out.println(o.toString());
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}// for
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
