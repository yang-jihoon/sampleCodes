package semina.enumtest;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2010. 9. 14.
 *
 */
public class SearchRequest {
	
	//�������� �Ķ����
	/**
	 * P : �α�������, N : ���ݳ�����, ...
	 *
	 */

	private String sortCode = "P"; //default

	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}

	public String getSortCode() {
		return sortCode;
	}

	//�������� �״�� �ΰ� ���� �����.
	private SortCode sortCodeenum = SortCode.P;

	public String getSortNm() {
		return SortCode.valueOf(sortCode).getCodeName();
	}

	public SortCode getSortCodeEnum() {
		return SortCode.valueOf(sortCode);
	}
}
