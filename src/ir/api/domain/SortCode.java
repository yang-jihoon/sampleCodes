package ir.api.domain;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 11. 14.
 *
 */
public enum SortCode {
	NP("11�� ��ŷ��") {
		@Override
		public String getSortQuery() {
			return "prd_evl_tot_qty desc, create_dt desc";
		}

		@Override
		public boolean useRiseKeywordRank() {
			return true;
		}

		@Override
		public String additionalRankClause() {
			return "SINGLE(pop_score FIELDVALUE) * 1";
		}

		@Override
		public boolean useCategoryRankScore() {
			return true;
		}
	},
	NPC("11�� ��ŷ��_ī�װ?") {
		@Override
		public String getSortQuery() {
			return "pop_score_rise_ctgr desc, prd_evl_tot_qty desc, create_dt desc";
		}

		@Override
		public boolean useRiseKeywordRank() {
			return false;
		}

		@Override
		public String additionalRankClause() {
			return "";
		}

		@Override
		public boolean useCategoryRankScore() {
			return false;
		}
	};
	
	private String codeName = "�α⵵��";

	SortCode(String codeName) {
		this.codeName = codeName;
	}

	public String getCodeName() {
		return codeName;
	}

	public abstract String getSortQuery();
	public abstract boolean useRiseKeywordRank();
	public abstract String additionalRankClause();
	public abstract boolean useCategoryRankScore();
}
