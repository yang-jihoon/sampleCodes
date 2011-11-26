package semina.mybatis;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 7. 9.
 *
 */
public class TestMain {
	public static void main(String[] args) {
		
		//MapperFactory가 하나의 Mapper만 return 하는 구조
		UserDataMapper mapper = MapperFactory.getMapper(UserDataMapper.class);
		User user = mapper.selectUser();
		
		System.out.println(user.getName());
		System.out.println(user.getAddress());
		
//		MapperFactory factory = new MapperFactory();  
//		DepartDataMapper departMapper = factory.getMapper(DepartDataMapper.class);
//		Depart depart = departMapper.selectDepart();
//		
//		System.out.println(depart.getName());
	}
}
