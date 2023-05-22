package JUnit_template;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helloworld {
	
private WebDriver driver;
	
	@BeforeAll
	static void setUpClass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PC-User\\Desktop\\Eclipse Corso Selenium 2022\\Drivers\\chromedriver.exe");
	}
	
	@BeforeEach
	void setup() {
		driver = new ChromeDriver();
	}

	@AfterEach
	void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}
	
	@Test
	void test1() {

		String baseUrl = "https://bonigarcia.dev/selenium-webdriver-java/";
		String expectedTitle = "Hands-On Selenium WebDriver with Java1";
		String actualTitle = "";

		// launch Chrome and direct it to the Base URL
		driver.get(baseUrl);

		// get the actual value of the title
		actualTitle = driver.getTitle();

		/*
		 * compare the actual title of the page with the expected one and print
		 * the result as "Passed" or "Failed"
		 */

		assertEquals(actualTitle, expectedTitle);
	
		
		//close Firefox
		driver.close();
	}
}
