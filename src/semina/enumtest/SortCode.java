package semina.enumtest;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2010. 9. 14.
 *
 */
public enum SortCode {
	P("인기도순"){
		@Override
		public String getSortQuery() {
			return "인기도순쿼리";
		}
	},
	B("정확도순"){
		@Override
		public String getSortQuery() {
			return "정확도순쿼리";
		}
	},
	H("높은가격순"){
		@Override
		public String getSortQuery() {
			return "높은가격순쿼리";
		}
	},
	L("낮은가격순"){
		@Override
		public String getSortQuery() {
			return "낮은가격순";
		}
	},
	S("판매순"){
		@Override
		public String getSortQuery() {
			return "판매순쿼리";
		}
	},
	N("최신등록순"){
		@Override
		public String getSortQuery() {
			return "최신등록순쿼리";
		}
	};

	private String codeName = "인기도순";

	SortCode(String codeName) {
		this.codeName = codeName;
	}

	public String getCodeName() {
		return codeName;
	}

	abstract String getSortQuery();
}
