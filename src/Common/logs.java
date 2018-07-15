package Common;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class logs {

	public static void log_generate(String message, String ClassName)
	{
		DOMConfigurator.configure("F:\\Scripts\\LockTheDeal\\LockTheDeal\\logs.xml");
		Logger l = Logger.getLogger(ClassName);
		l.info(message);
	}
}
