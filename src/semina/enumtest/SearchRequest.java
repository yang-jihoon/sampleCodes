package semina.enumtest;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2010. 9. 14.
 *
 */
public class SearchRequest {
	
	//정렬조건 파라메터
	/**
	 * P : 인기도순, N : 최신순, ...
	 *
	 */

	private String sortCode = "P"; //default

	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}

	public String getSortCode() {
		return sortCode;
	}

	//기존것은 그대로두고 새로 만들자
	//private SortCode sortCodeenum = SortCode.P;

	public String getSortNm() {
		return SortCode.valueOf(sortCode).getCodeName();
	}

	public SortCode getSortCodeEnum() {
		return SortCode.valueOf(sortCode);
	}
}
