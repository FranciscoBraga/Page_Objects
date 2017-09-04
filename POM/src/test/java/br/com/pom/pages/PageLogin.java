/**
 * 
 */
package br.com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Francisco Braga
 * 
 *
 */

public class PageLogin {
	
	WebDriver driver;
	
	//elementos verificados no teste
	By userName =By.id("user_login");
	By password = By.id("user_pass");
	By loginButton = By.id("wp-submit");
	
	/**
	 * Com o construtor recebendo um parametro do tipo
	 * Webdriver permiter que seja mudado o driver do
	 *browser, assim podendo trabalhar com diferentes
	 *navegadores.
	 */
	public PageLogin(WebDriver driver){
		
		this.driver = driver;
		
	}
	
	
	public void TypeUserName(String usuario) {
		
		driver.findElement(userName).sendKeys(usuario);
		
	}
	
	public void TypePassword(String senha) {
		
		driver.findElement(password).sendKeys(senha);
	}
	
	public void ClickloginButton() {
		
		driver.findElement(loginButton).click();
	}

}
