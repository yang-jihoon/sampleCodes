package hotreload;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2010. 8. 23.
 *
 */
public class Test {
	private Log logger = LogFactory.getLog(Test.class);
	
	public static void main(String[] args) throws Exception {
		Reloader reloader = new Reloader();
        reloader.run();
	}

}
