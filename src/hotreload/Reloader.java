package hotreload;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author need4spd, need4spd@cplanet.co.kr, 2010. 8. 23.
 *
 */
public class Reloader {
	private Log logger = LogFactory.getLog(Reloader.class);

    URLClassLoader appClassLoader = null;
    File dir = new File("d:/");


    public void run() throws Exception {
        URL url = dir.toURL();
        URL[] urls = new URL[]{url};

        while(true) {
            Thread.sleep(2000);

            this.appClassLoader = new URLClassLoader(urls);
            //Thread.currentThread().setContextClassLoader( this.appClassLoader );
            Class appClass = this.appClassLoader.loadClass("BaseDomain");
            Method printName = appClass.getMethod("printName", null);

            Object appInstance = appClass.newInstance();
            System.out.println(appInstance);
            printName.invoke(appInstance, null);
        }
    }
}
