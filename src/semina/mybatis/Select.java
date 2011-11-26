package semina.mybatis;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2011. 7. 9.
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Select {
	String query();
}
