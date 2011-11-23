package ir.api.domain;

import ir.api.searchable.SearchQuery;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 11. 14.
 *
 */
public class SearchRequest {
	private int pageNum;
	private SearchQuery query;
	private int fetchSize;
	private boolean useLogFlag = false;
	private SortCode sortCode = SortCode.NP;
	private String scenarioName;
	
	
	
	/**
	 * @return the scenarioName
	 */
	public String getScenarioName() {
		return scenarioName;
	}
	/**
	 * @param scenarioName the scenarioName to set
	 */
	public void setScenarioName(String scenarioName) {
		this.scenarioName = scenarioName;
	}
	/**
	 * @return the sortCode
	 */
	public SortCode getSortCode() {
		return sortCode;
	}
	/**
	 * @param sortCode the sortCode to set
	 */
	public void setSortCode(SortCode sortCode) {
		this.sortCode = sortCode;
	}
	/**
	 * @return the pageNum
	 */
	public int getPageNum() {
		return pageNum;
	}
	/**
	 * @param pageNum the pageNum to set
	 */
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	/**
	 * @return the query
	 */
	public SearchQuery getQuery() {
		return query;
	}
	/**
	 * @param query the query to set
	 */
	public void setQuery(SearchQuery query) {
		this.query = query;
	}
	/**
	 * @return the fetchSize
	 */
	public int getFetchSize() {
		return fetchSize;
	}
	/**
	 * @param fetchSize the fetchSize to set
	 */
	public void setFetchSize(int fetchSize) {
		this.fetchSize = fetchSize;
	}
	/**
	 * @return the useLogFlag
	 */
	public boolean isUseLogFlag() {
		return useLogFlag;
	}
	/**
	 * @param useLogFlag the useLogFlag to set
	 */
	public void setUseLogFlag(boolean useLogFlag) {
		this.useLogFlag = useLogFlag;
	}

}
