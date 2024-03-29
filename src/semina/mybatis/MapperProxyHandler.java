package semina.mybatis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 7. 9.
 *
 */
public class MapperProxyHandler implements InvocationHandler {

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println(method.getName());
		
		Select select = method.getAnnotation(Select.class);
		
		if(select != null) {
			String selectQuery = select.query();
			
			System.out.println("Query : " + selectQuery);
			System.out.println("connect db");
			System.out.println("select");
			
		}
		
		//query to db
		User user = new User();
		user.setName("장용석");
		user.setAddress("서울");
		
		System.out.println("select end");
		
		return user;
		
	}
	
	//Type에 따른 분기
//	@Override
//	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//		
//		System.out.println(method.getName());
//		
//		Select select = method.getAnnotation(Select.class);
//		Class<?> returnType = method.getReturnType();
//		
//		if(select != null) {
//			String selectQuery = select.query();
//			
//			System.out.println("Query : " + selectQuery);
//			System.out.println("connect db");
//			System.out.println("select");
//			
//		}
//		
//		//return type 확인
//		if(returnType == User.class) {
//			User user = new User();
//			user.setName("장용석");
//			user.setAddress("서울");
//			
//			return user;
//			
//		} else if (returnType == Depart.class) {
//			Depart depart = new Depart();
//			depart.setName("OM개발그룹");
//		
//			return depart;
//		}
//		
//		
//		System.out.println("select end");		
//	}
	
	//Reflect 사용
//	@Override
//	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//
//		System.out.println(method.getName());
//
//		Select select = method.getAnnotation(Select.class);
//
//		System.out.println("annotation : " + select);
//
//		Class<?> retClass = method.getReturnType();
//
//		Object obj = retClass.newInstance();
//
//		Map<String, String> queryVlaues = new HashMap<String, String>();
//		queryVlaues.put( "name", "장용석" );
//		queryVlaues.put( "address", "서울" );
//
//		for ( String key : queryVlaues.keySet().toArray( new String[] {} ) ) {
//
//			//메서드이름의 조합
//			String mName = "set" + key.substring( 0, 1 ).toUpperCase() + key.substring( 1 );
//
//			//Reflect로 쿼리 결과를 파라메터로 하여 setter 메서드 호출
//			Method m = retClass.getMethod( mName, new Class[] { String.class } );
//			m.invoke( obj, new Object[] { queryVlaues.get( key ) } );
//		}
//
//		System.out.println( "select end" );
//
//		return obj;		
//	}
}

