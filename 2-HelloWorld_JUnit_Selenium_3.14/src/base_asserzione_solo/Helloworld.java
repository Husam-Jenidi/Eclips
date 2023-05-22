package base_asserzione_solo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helloworld {
	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PC-User\\Desktop\\Eclipse Corso Selenium 2022\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://bonigarcia.dev/selenium-webdriver-java/";
		String expectedTitle = "Hands-On Selenium WebDriver with Java1";
		String actualTitle = "";

		// launch Chrome and direct it to the Base URL
		driver.get(baseUrl);

		// get the actual value of the title
		actualTitle = driver.getTitle();

		//compare the actual title of the page with the expected one
		assertEquals(actualTitle, expectedTitle);
		//close Chrome
		driver.close();
	}
}
