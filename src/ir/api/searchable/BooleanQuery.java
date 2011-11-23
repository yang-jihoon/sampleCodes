package ir.api.searchable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 11. 14.
 *
 */
public class BooleanQuery extends SearchQuery {
	
	private List<SearchQuery> queryList = null;
	private List<BooleanCondition> queryBooleanConditionList = new ArrayList<BooleanCondition>();
	
	private int maxCluaseCount = 300;
	
	public BooleanQuery() {
		queryList = new ArrayList<SearchQuery>(maxCluaseCount);
	}
	
	public void addQuery(SearchQuery query, BooleanCondition queryBooleanCondition) {
		
		if(queryList.size() >= maxCluaseCount) {
			throw new IllegalStateException("Boolean Query�� Max Clause�� ���� 300�Դϴ�. ���� �ʿ�� �˻�������Ʈ�� �������ּ���.");
		}
		
		queryList.add(query);
		queryBooleanConditionList.add(queryBooleanCondition);
	}
	
	public void setMaxCluaseCount(int count) {
		this.maxCluaseCount = count;
	}
	
	public List<SearchQuery> getQueryList() {
		return queryList;
	}
	
	@Override
	protected String getWhereClause() {
		StringBuilder sb = new StringBuilder();
		
		if(queryBooleanConditionList.size() == 0 || queryList.size() == 0) {
			throw new IllegalStateException("Boolean ������ Size�� 0 �̰ų�, BooleanCondition�� Size�� 0 �Դϴ�. " +
													"queryList : ["+queryList.size()+"], queryBooleanConditionList ["+queryBooleanConditionList.size()+"]");
		}
		
		if(queryBooleanConditionList.size() != queryList.size()) {
			throw new IllegalStateException("Boolean ������ Size�� BooleanCondition�� Size�� ���� �ʽ��ϴ�.");
		}
		
		if(queryBooleanConditionList.get(0) == BooleanCondition.ANDNOT) {
			throw new IllegalStateException("Boolean ������ ù��° ������ ANDNOT�� �� ���� ����ϴ�.");
		}
		
		if(queryBooleanConditionList.get(0) == BooleanCondition.OR) {
			throw new IllegalStateException("Boolean ������ ù��° ������ OR�� �� ���� ����ϴ�.");
		}
		
		for(int index = 0; index < queryList.size(); index++) {
			
			if(sb.length() > 0) {
				sb.append(" ").append(queryBooleanConditionList.get(index).name()).append(" ").append(queryList.get(index).getWhereClause());
			} else {
				if(index == 0) {
					sb.append(" ").append(queryList.get(index).getWhereClause());
				} else {
					sb.append(queryBooleanConditionList.get(index).name()).append(" ").append(queryList.get(index).getWhereClause());
				}
			}
		}
		
		sb = new StringBuilder("(").append(sb).append(")");
		
		return sb.toString();
	}

}