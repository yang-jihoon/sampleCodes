package ir.api.searchable;

import ir.api.domain.SearchRequest;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 11. 14.
 *
 */
public class PrdVolumeSearchService {
	
	public String search(SearchRequest request) {
		
		request.setScenarioName("prd_scenario");
		
		VolumeSearcher volumeSearcher = new VolumeSearcher();
		volumeSearcher.search(request);
		
		return "result";
	}

}
