package semina.testframework.step4;

import java.util.ArrayList;
import java.util.List;

public class ServiceTestCollector {
	
	private List<ServiceTest> testLists = new ArrayList<ServiceTest>();
	private boolean isAllPassed = false;

	public void addTester(ServiceTest tester) {
		this.testLists.add(tester);
	}

	public boolean isAllPassed() {
		for(ServiceTest tester : testLists) {
			isAllPassed = tester.isPassed();
		}

		return isAllPassed;
	}
}
