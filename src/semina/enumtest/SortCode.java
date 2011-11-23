package semina.enumtest;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2010. 9. 14.
 *
 */
public enum SortCode {
	P("�α⵵��"){
		@Override
		public String getSortQuery() {
			return "�α⵵������";
		}
	},
	B("���ݳ�����"){
		@Override
		public String getSortQuery() {
			return "���ݳ���������";
		}
	},
	H("�������ݼ�"){
		@Override
		public String getSortQuery() {
			return "�������ݼ�����";
		}
	},
	L("�������ݼ�"){
		@Override
		public String getSortQuery() {
			return "�������ݼ�����";
		}
	},
	S("������������"){
		@Override
		public String getSortQuery() {
			return "����������������";
		}
	},
	N("��Ȯ����"){
		@Override
		public String getSortQuery() {
			return "��Ȯ��������";
		}
	};

	private String codeName = "�α⵵��";

	SortCode(String codeName) {
		this.codeName = codeName;
	}

	public String getCodeName() {
		return codeName;
	}

	abstract String getSortQuery();
}
