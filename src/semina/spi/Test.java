package semina.spi;


/**
 * @author need4spd, need4spd@cplanet.co.kr, 2010. 2. 19.
 *
 */
public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("semina.spi.MyDriver");
		Connection connection = DriverManager.getConnection();
		
		System.out.println(connection);
		
	}
}
