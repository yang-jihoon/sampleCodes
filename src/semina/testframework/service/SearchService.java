package semina.testframework.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SearchService {
	
	public List<Product> search(String keyword) {
		
		Product p = new Product();
		p.setPrdName("나이키");
		p.setPrdNo("1");
		p.setPrice(BigDecimal.ONE);
		
		List<Product> searchResult = new ArrayList<Product>();
		searchResult.add(p);
		
		return searchResult;
	}
}
