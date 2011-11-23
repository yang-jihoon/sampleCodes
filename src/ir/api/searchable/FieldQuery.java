package ir.api.searchable;

import java.util.List;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 11. 14.
 *
 */
public class FieldQuery extends SearchQuery {
	
	private final String field;
	private final List<String> values;
	private BooleanCondition fieldBooleanCondition = BooleanCondition.AND;
	
	public FieldQuery(String field, List<String> values, BooleanCondition fieldBooleanCondition) {
		this.field = field;
		this.values = values;
		this.fieldBooleanCondition = fieldBooleanCondition;
	}
	
	public BooleanCondition getFieldBooleanCondition() {
		return fieldBooleanCondition;
	}

	public String getField() {
		return field;
	}

	public List<String> getValues() {
		return values;
	}


	@Override
	public String toString() {
		return "[field=" + field + ", values=" + values
				+ ", fieldBooleanCondition=" + fieldBooleanCondition + "]";
	}
	
	@Override
	protected String getWhereClause() {
		StringBuilder sb = new StringBuilder();
		
		for(String value : getValues()) {
			
			if(sb.length() > 0) {
				sb.append(" ").append(getFieldBooleanCondition().name()).append(" ").append(getField()).append("='").append(value).append("'");
			} else {
				sb.append(getField()).append("='").append(value).append("'");
			}
		}
		
		sb = new StringBuilder("(").append(sb).append(")");
		
		return sb.toString();
	}
}