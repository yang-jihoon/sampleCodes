package semina.clone;

import java.util.ArrayList;
import java.util.List;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2010. 5. 15.
 *
 */
public class ClassRoom implements Cloneable {
	
	private List<Student> students = new ArrayList<Student>();
	
	private String className = "";

	/**
	 * @return the students
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * @param students the students to set
	 */
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
