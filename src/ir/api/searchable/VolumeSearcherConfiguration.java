package ir.api.searchable;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 11. 14.
 *
 */
class VolumeSearcherConfiguration {

	private String scenarioName;
	private String userLog;
	private String extraLog;
	private String whereQuery;
	private String orderQuery;
	private String rankClause;
	private int startOffset;
	private int fetchCount;
	private boolean needCategoryRankScore = true;
	private boolean needWordScore = true;
	
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
	 * @return the userLog
	 */
	public String getUserLog() {
		return userLog;
	}
	/**
	 * @param userLog the userLog to set
	 */
	public void setUserLog(String userLog) {
		this.userLog = userLog;
	}
	/**
	 * @return the extraLog
	 */
	public String getExtraLog() {
		return extraLog;
	}
	/**
	 * @param extraLog the extraLog to set
	 */
	public void setExtraLog(String extraLog) {
		this.extraLog = extraLog;
	}
	/**
	 * @return the whereQuery
	 */
	public String getWhereQuery() {
		return whereQuery;
	}
	/**
	 * @param whereQuery the whereQuery to set
	 */
	public void setWhereQuery(String whereQuery) {
		this.whereQuery = whereQuery;
	}
	/**
	 * @return the orderQuery
	 */
	public String getOrderQuery() {
		return orderQuery;
	}
	/**
	 * @param orderQuery the orderQuery to set
	 */
	public void setOrderQuery(String orderQuery) {
		this.orderQuery = orderQuery;
	}
	/**
	 * @return the rankClause
	 */
	public String getRankClause() {
		return rankClause;
	}
	/**
	 * @param rankClause the rankClause to set
	 */
	public void setRankClause(String rankClause) {
		this.rankClause = rankClause;
	}
	/**
	 * @return the startOffset
	 */
	public int getStartOffset() {
		return startOffset;
	}
	/**
	 * @param startOffset the startOffset to set
	 */
	public void setStartOffset(int startOffset) {
		this.startOffset = startOffset;
	}
	/**
	 * @return the fetchCount
	 */
	public int getFetchCount() {
		return fetchCount;
	}
	/**
	 * @param fetchCount the fetchCount to set
	 */
	public void setFetchCount(int fetchCount) {
		this.fetchCount = fetchCount;
	}
	/**
	 * @return the needCategoryRankScore
	 */
	public boolean isNeedCategoryRankScore() {
		return needCategoryRankScore;
	}
	/**
	 * @param needCategoryRankScore the needCategoryRankScore to set
	 */
	public void setNeedCategoryRankScore(boolean needCategoryRankScore) {
		this.needCategoryRankScore = needCategoryRankScore;
	}
	/**
	 * @return the needWordScore
	 */
	public boolean isNeedWordScore() {
		return needWordScore;
	}
	/**
	 * @param needWordScore the needWordScore to set
	 */
	public void setNeedWordScore(boolean needWordScore) {
		this.needWordScore = needWordScore;
	}
}
