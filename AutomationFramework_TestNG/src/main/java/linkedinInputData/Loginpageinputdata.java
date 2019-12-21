package linkedinInputData;

import java.io.IOException;
import java.util.Properties;

import mainConfiguration.Globalconfiguration;

//import mainConfiguration.Setuppropertiesconfiguration;

public class Loginpageinputdata extends Globalconfiguration{
	
	//Setuppropertiesconfiguration globalProperties = new Setuppropertiesconfiguration();
	//Properties prop= new Properties();
	public Properties prop = null;
	String username= ""; // = prop.getProperty("username"); //Insert your username here
	String password= ""; //= prop.getProperty("password"); //Insert your password here
	
	
	public void setUsername(String username) throws IOException {
		prop = getProperties();
		username = prop.getProperty("username");
		this.username = username;

	}

	public void setPassword(String password) throws IOException {
		prop = getProperties();
		password = prop.getProperty("password");
		this.password = password;

	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}

}