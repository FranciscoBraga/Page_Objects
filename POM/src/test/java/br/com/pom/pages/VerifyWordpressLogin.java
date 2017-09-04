/**
 * 
 */
package br.com.pom.pages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * @author Francisco Braga
 *
 */
public class VerifyWordpressLogin {
	
	@Test
	public void VerifyValidLogin() {
		
		System.setProperty("webdriver.chrome.driver", "D:/programas/selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
	
		PageLogin login = new PageLogin(driver);
		
		login.TypeUserName("admin");
		login.TypePassword("demo123");
		login.ClickloginButton();
		
		driver.close();
	}

}
