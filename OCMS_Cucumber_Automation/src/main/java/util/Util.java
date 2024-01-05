package util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class Util
{
	public static String getExecutionProperty(String key)
	{
		Properties prop = null;
		try
		{
			FileReader reader=new FileReader("src/test/resources/execution.properties");
			prop = new Properties();  
			prop.load(reader);
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}

		return prop.getProperty(key);
	}
}