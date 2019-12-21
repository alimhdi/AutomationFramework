package linkedinUIElementLocator;

public class Loginuielementlocator {
	String usernameid = "username";
	String passwordid = "password";
	String singInButton = "//*[@id='app__container']/main/div/form/div[3]/button";

	// Setters to use in main when you need to overwrite the default value
	public void setUsernameWebElement(String usernameid) {
		this.usernameid = usernameid;
	}
	
	public void setPasswordWebElement(String passwordid) {
		this.passwordid = passwordid;
	}
	
	public void setSubmitButtonWebElement(String singInButton) {
		this.singInButton = singInButton;
	}
	
	// Getters identification for loginmethod1 UI elements
	public String getUsernameWebElement() {
		return usernameid;
	}
	
	public String getPasswordWebElement() {
		return passwordid;
	}
	
	public String getSubmitButtonWebElement() {
		return singInButton;
	}

}