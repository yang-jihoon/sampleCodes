package semina.equals;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2010. 8. 24.
 *
 */
public class CaseInsensitiveString {
	
	private String s;
	
	public CaseInsensitiveString(String s) {
		this.s = s;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof CaseInsensitiveString) {
			return s.equalsIgnoreCase(((CaseInsensitiveString)o).s);
		}
		
		if(o instanceof String) {
			return s.equalsIgnoreCase((String)o);
		}
		
		return false;
	}
}
