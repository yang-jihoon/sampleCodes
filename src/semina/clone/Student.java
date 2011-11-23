package semina.clone;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2010. 5. 15.
 *
 */
public class Student implements Cloneable {

	private int no;
	private String name;

	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}
	/**
	 * @param no the no to set
	 */
	public void setNo(int no) {
		this.no = no;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "[name : "+name+"] ,[no : "+no+"]";
	}
}
