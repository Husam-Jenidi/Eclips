package Edge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelloWorld {
	public static void main(String[] args) throws InterruptedException {

		// declaration and instantiation of objects/variables
		
		WebDriverManager.edgedriver().setup()	;	
		WebDriver driver = new EdgeDriver();
		String baseUrl = "https://bonigarcia.dev/selenium-webdriver-java/";
		String expectedTitle = "Hands-On Selenium WebDriver with Java";
		String actualTitle = "";

		// launch Edge and direct it to the Base URL
		driver.get(baseUrl);

		// get the actual value of the title
		actualTitle = driver.getTitle();
		Thread.sleep(3000);

		// compare the actual title of the page with the expected one and print
		// the result as "Passed" or "Failed"
		if (actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

		//close the browser
		driver.quit();
	}
}
