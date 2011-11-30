package semina.testframework.step4;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class TesterMain {
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {

		Class<ServiceTest> clazz = ServiceTest.class;

		InputStream is = clazz.getResourceAsStream("tester.properties");
		Properties prop = new Properties();
		prop.load(is);

		ServiceTestCollector testCollector = new ServiceTestCollector();

		String[] testers = prop.getProperty("tester").split(";");

		for(String className : testers) {
			Class<?> claz = Class.forName(className);


			ServiceTest tester = (ServiceTest)claz.newInstance();
			testCollector.addTester(tester);
		}

		System.out.println(prop.getProperty("tester"));

		System.out.println("테스트 결과 : " + testCollector.isAllPassed());
	}
}
