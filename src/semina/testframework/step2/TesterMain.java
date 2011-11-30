package semina.testframework.step2;

public class TesterMain {
	public static void main(String[] args) {

		SearchServiceTester tester = new SearchServiceTester();
		boolean isPassed = tester.isPassed();
		
		System.out.println("결과 : " + isPassed);

	}
}
