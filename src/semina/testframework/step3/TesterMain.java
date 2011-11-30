package semina.testframework.step3;



public class TesterMain {
	public static void main(String[] args) {
		ServiceTestCollector testCollector = new ServiceTestCollector();
		
		testCollector.addTester(new SearchServiceTester());
		testCollector.addTester(new KeywordSelectTester());
		
		boolean testResult = testCollector.isAllPassed();
		
		System.out.println(testResult);
	}
}
