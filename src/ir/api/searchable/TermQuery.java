package ir.api.searchable;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 11. 14.
 *
 */
public class TermQuery extends SearchQuery {
	
	private String field;
	private String value;
	private String searchMethod = "allwordthruindexsyn";
	
	public TermQuery(String field, String value) {
		this.field = field;
		this.value = value;
	}
	
	/**
	 * @return the field
	 */
	public String getField() {
		return field;
	}
	/**
	 * @param field the field to set
	 */
	public void setField(String field) {
		this.field = field;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	public String getSearchMethod() {
		return searchMethod;
	}

	public void setSearchMethod(String searchMethod) {
		this.searchMethod = searchMethod;
	}

	@Override
	public String toString() {
		return "[field=" + field + ", value=" + value
				+ ", searchMethod=" + searchMethod + "]";
	}

	@Override
	protected String getWhereClause() {
		StringBuilder sb = new StringBuilder();
		sb.append(getField()+"='").append(getValue()).append("' ").append(searchMethod);
		
		return sb.toString();
	}
}
