package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\automation\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
		driver.findElement(By.id("txtUsername")).sendKeys("rishi");
		
	}

}
