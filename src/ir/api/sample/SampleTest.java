package ir.api.sample;

import ir.api.domain.SearchRequest;
import ir.api.searchable.BooleanCondition;
import ir.api.searchable.BooleanQuery;
import ir.api.searchable.FieldQuery;
import ir.api.searchable.PrdVolumeSearchService;
import ir.api.searchable.SearchQuery;
import ir.api.searchable.TermQuery;

import java.util.ArrayList;
import java.util.List;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 11. 14.
 *
 */
public class SampleTest {
	public static void main(String[] args) {
		//term query
		SearchQuery termQuery = new TermQuery("text_idx", "����Ű");
		
		SearchRequest request = new SearchRequest();
		request.setQuery(termQuery);
		
		PrdVolumeSearchService searchService = new PrdVolumeSearchService();
		searchService.search(request);
		
		//FieldQuery
		List<String> brandcd = new ArrayList<String>();
		brandcd.add("1234");
		brandcd.add("1234");
		brandcd.add("1234");
		brandcd.add("1234");
		brandcd.add("1234");
		
		SearchQuery fieldQuery = new FieldQuery("brand_cd", brandcd, BooleanCondition.AND);
		request.setQuery(fieldQuery);
		
		searchService.search(request);		
		
		fieldQuery = new FieldQuery("brand_cd", brandcd, BooleanCondition.OR);
		request.setQuery(fieldQuery);
		
		searchService.search(request);		
		
		//BooleanQuery
		BooleanQuery booleanQuery = new BooleanQuery();
		booleanQuery.addQuery(termQuery, BooleanCondition.AND);
		booleanQuery.addQuery(fieldQuery, BooleanCondition.AND);
		
		request.setQuery(booleanQuery);
		
		searchService.search(request);		
		
		//����˻���
		SearchQuery tq1 = new TermQuery("text_idx", "����Ű");
		SearchQuery tq2 = new TermQuery("text_idx", "�ȭ");
		SearchQuery tq3 = new TermQuery("text_idx", "û����");
		SearchQuery tq4 = new TermQuery("text_idx", "���");
		
		BooleanQuery bq = new BooleanQuery();
		bq.addQuery(tq1, BooleanCondition.AND);
		bq.addQuery(tq2, BooleanCondition.AND);
		bq.addQuery(tq3, BooleanCondition.AND);
		bq.addQuery(tq4, BooleanCondition.AND);
		
		request.setQuery(bq);
		searchService.search(request);		
	}
}
