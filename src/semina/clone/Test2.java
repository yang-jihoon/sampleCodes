package semina.clone;

import java.util.ArrayList;
import java.util.List;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2010. 5. 15.
 *
 */
public class Test2 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Student st = new Student();
		st.setName("장용석");
		st.setNo(1);
		
		Student st2 = new Student();
		st2.setName("양지훈");
		st2.setNo(2);
		
		Student st3 = new Student();
		st3.setName("이경진");
		st3.setNo(3);
		
		List<Student> students = new ArrayList<Student>();
		students.add(st);
		students.add(st2);
		students.add(st3);
		
		ClassRoom majorClass = new ClassRoom();
		majorClass.setStudents(students);
		majorClass.setClassName("OM개발그룹");
		
		System.out.println("majorClass : " + majorClass.getClassName());
		System.out.println("majorClass : " + majorClass.getStudents());
		
		System.out.println("-------------------------------------------------------");
		
		ClassRoom majorClass2 = (ClassRoom) majorClass.clone();
		
		System.out.println("majorClass2 : " + majorClass2.getClassName());
		System.out.println("majorClass2 : " + majorClass2.getStudents());
		
		Student st4 = new Student();
		st4.setName("배성렬");
		st4.setNo(4);
		majorClass2.getStudents().add(st4);
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println("majorClass : " + majorClass.getStudents());
		System.out.println("majorClass2 : " + majorClass2.getStudents());
	}
}
