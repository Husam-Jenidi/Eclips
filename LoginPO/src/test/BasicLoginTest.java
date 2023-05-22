package test;

public class BasicLoginTest {
private WebDriver driver;
private LoginFormPO login;
private LoginSucceePO loginSuccess;

@BeforeAll
public static void beforeAll() {
	webDriverManager.chromedriver().setup();}
@BeforeEach
public void beforeEach() {
	driver= new ChromeDriver();
}
@Test
public void testLoginOk() {
	login= new LoginFormPO(driver);
login.with("user","user");
loginSuccess = new LoginSuccessPO(driver);
assertTrue(loginSuccess.successBoxIsPresent());
}
#Test
public void testLoginNoOK() {
	login = new LoginFormPO(driver);
	login.with("user","error");
	assertTrue(login.invalidBoxIsPresent());
}
}


