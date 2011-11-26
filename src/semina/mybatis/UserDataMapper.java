package semina.mybatis;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 7. 9.
 *
 */
public interface UserDataMapper {

	@Select(query = "select * from user")
	User selectUser();
}
