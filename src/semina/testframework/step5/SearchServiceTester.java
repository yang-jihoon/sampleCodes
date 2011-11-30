package semina.testframework.step5;

import java.util.List;

import semina.testframework.service.Product;
import semina.testframework.service.SearchService;

public class SearchServiceTester {

	@MyTest
	public boolean productTest() {
		List<Product> result1 = new SearchService().search("나이키");
		List<Product> result2 = new SearchService().search("나이키");
		
		if(result1.equals(result2)) {
			//blar blar blar
		}
		
		return true;
	}

}
