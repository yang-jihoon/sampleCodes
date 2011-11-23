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
			query = "�α⵵������";
			log="�α⵵��";
		} else if ("B".equals(rq.getSortCode())) {
			query = " ��Ȯ��������";
			log = "��Ȯ����";
		} else if ("N".equals(rq.getSortCode())) {
			query = "�ֽŵ�ϼ�����";
			log = "�ֽŵ�ϼ�";
		} else if ("H".equals(rq.getSortCode())) {
			query = " ���ݳ���������";
			log = "���ݳ�����";
		} else if ("L".equals(rq.getSortCode())) {
			query = "���ݳ���������";
			log = "���ݳ�����";
		} else if ("S".equals(rq.getSortCode())) {
			query = " ����������������";
			log = "����������";
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
