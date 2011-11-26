package semina.mybatis;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 7. 9.
 *
 */
public interface DepartDataMapper {
	
	@Select(query = "select * from depart")
	Depart selectDepart();
	
}
