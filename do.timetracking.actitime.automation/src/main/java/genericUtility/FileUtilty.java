package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtilty {
	
	public String fetchDataFromPropertyFile(String key) throws IOException {
		
				FileInputStream fis = new FileInputStream("./src/test/resources/propertyData.properties");
				Properties property = new Properties();
				//load the java representation of property file
				property.load(fis);
				//getting the value using the key
				return property.getProperty(key);
	}

}
