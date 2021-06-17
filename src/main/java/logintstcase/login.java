package logintstcase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(dataProvider="login", dataProviderClass=Data.class)
public class login {
	
/*
	String [][] data= {
			{"Admin","admin123"},
			{"admin","Admin123"},
			{"AdmiN","admin13"},
			{"AdmIn","admin213"}
			
	};
	
	*/
	
	@DataProvider(name="loginData")
	/*
	public void loginDataProvider() {
	   //public String[][] loginDataProvider(){
			return data;
		return
	}
	
	@Test(dataProvider="loginData")
	*/
	
	public void login(String uname,String upwd) {
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
         driver.manage().window().maximize();
         
		
         driver.findElement(By.id("txtUsername")).sendKeys(uname);
         driver.findElement(By.id("txtPassword")).sendKeys(upwd);
         driver.findElement(By.id("btnLogin")).click();
         driver.close();
	}

}
