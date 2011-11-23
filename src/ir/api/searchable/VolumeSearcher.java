package ir.api.searchable;

import ir.api.domain.SearchRequest;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 11. 14.
 *
 */
public class VolumeSearcher {

	public void search(SearchRequest request) {
		VolumeSearcherConfiguration vsc = new VolumeSearcherConfiguration();
		vsc.setScenarioName(request.getScenarioName());
		//....
		vsc.setWhereQuery(request.getQuery().getWhereClause());
		vsc.setOrderQuery(request.getSortCode().getSortQuery());
		//rankingclause �����..
		
		DocumentSearcher searcher = new DocumentSearcher(vsc);
		searcher.search();
		
		System.out.println(request.getQuery().getWhereClause());
	}
}