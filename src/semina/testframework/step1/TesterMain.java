package semina.testframework.step1;

import java.util.List;

import semina.testframework.service.Product;
import semina.testframework.service.SearchService;

public class TesterMain {
public static void main(String[] args) {
		
		List<Product> result1 = new SearchService().search("나이키");
		List<Product> result2 = new SearchService().search("나이키");
		
		test(result1, result2);
	}
	
	private static void test(List<Product> firstList, List<Product> secondList) {
		//Test 수행
		
		System.out.println("테스트 통과");
	}
}
