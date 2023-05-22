package POs;

public class LoginFormPO {
private WebDriver driver;
private By usernameInput= By.id("username");
private By passwordInput = By.id("password");
private By submitButton = By.cssSelector("button");
private By invalidBox = By.id("invalid");
public LoginFormPO(webDriver driver) {
	this.driver = driver;
	driver.get("https://bonigarcia.dev/selenium-webdriver-java/login-form.html");
}
public void with(String username, String pwd) {
	driver.findElement(userInput).sendKeys(username);
	driver.findElement(passwordInput).sendKeys(username);
	driver.findElement(submitButton).click();
}
public boolean invalidBoxIsPresent() {
	return driver.findElement(invalidBox).isDisplayed();
}
}
