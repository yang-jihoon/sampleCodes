package semina.enumtest;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2010. 9. 14.
 *
 */
public class QueryMaker {

	public static void main(String[] args) {
		QueryMaker maker = new QueryMaker();
		SearchRequest rq = new SearchRequest();

		maker.build(rq);
		maker.build_new(rq);

	}

	public void build(SearchRequest rq) {
		String query = "";
		String log = "";
		if("P".equals(rq.getSortCode())) {
			query = "인기도순쿼리";
			log="인기도순에 대한 로그";
		} else if ("B".equals(rq.getSortCode())) {
			query = "정확도순쿼리";
			log = "정확도에 대한 로그";
		} else if ("N".equals(rq.getSortCode())) {
			query = "최신순쿼리";
			log = "최신순에 대한 로그";
		} else if ("H".equals(rq.getSortCode())) {
			query = "높은가격순쿼리";
			log = "높은가격순에대한로그";
		} else if ("L".equals(rq.getSortCode())) {
			query = "낮은가격순쿼리";
			log = "낮은가격순에대한로그";
		} else if ("S".equals(rq.getSortCode())) {
			query = "판매순쿼리";
			log = "판매순에대한로그";
		}

		System.out.println("query org : " + query);
		System.out.println("log org : " + log);
	}

	public void build_new(SearchRequest rq) {
		//After
		String query = rq.getSortCodeEnum().getSortQuery();
		String log = rq.getSortNm();

		System.out.println("query new : " + query);
		System.out.println("log new : " + log);
	}
}
