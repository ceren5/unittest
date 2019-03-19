package com.pabeda.unittest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumProject {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.hepsiburada.com/");
			
			 WebElement myAccount = driver.findElement(By.id("myAccount"));

		     Actions hover = new Actions(driver);
		     hover.moveToElement(myAccount).perform();
		     WebElement loginLink = driver.findElement(By.id("login"));
		     //Thread.sleep(1000);
		     loginLink.click();
		     
		     Thread.sleep(2000);
		     
		     WebElement signin = driver.findElement(By.cssSelector("#login-container > section.login-box.box > div > div.login-selections > div:nth-child(2) > div > label"));
		     
		     signin.click();
		     
		     WebElement nameSignin = driver.findElement(By.id("firstname"));
		     
		     nameSignin.clear();
		     nameSignin.click();
		     nameSignin.sendKeys("adin");
		     
		     WebElement surnameSignin = driver.findElement(By.id("lastname"));
		     
		     surnameSignin.clear();
		     surnameSignin.click();
		     surnameSignin.sendKeys("soyadin");
		     
		     WebElement emailSignin = driver.findElement(By.id("email-register"));
			 
			 emailSignin.clear();
			 emailSignin.click();
			 emailSignin.sendKeys("emailadresin@gmail.com");
			 
			 WebElement passwordSignin = driver.findElement(By.id("password-register"));
			 
			 passwordSignin.clear();
			 passwordSignin.click();
			 passwordSignin.sendKeys("sifren");
			 
			 WebElement accept = driver.findElement(By.cssSelector("#form-user > div:nth-child(5) > div > label:nth-child(2)"));
			 
			 accept.click();
			 
			 WebElement signIn = driver.findElement(By.cssSelector("#form-user > div.form-actions > button"));
			 
			 signIn.click();
		     
		     /*
		     
		     WebElement email = driver.findElement(By.id("email"));
		    		 
		    		 email.clear();
		    		 email.click();
		    		 email.sendKeys("emailadresin@mynet.com");
		    		 
		     WebElement password = driver.findElement(By.id("password"));
		     
		     		password.clear();
		     		password.click();
		     		password.sendKeys("sifren");
		     		
		     WebElement enter = driver.findElement(By.cssSelector("#form-login > div.form-actions > button"));
		     		
		     		enter.click();
		     		
		     	*/
		     		
			Thread.sleep(5000);
			
			/*try {
				WebElement username = driver.findElement(By.cssSelector("#myAccount > a:nth-child(1)"));	
				System.out.println("Doğru kulanıcı adı ya da şifre");
			}catch(Exception haydar) {
				System.out.println("Yanlış kulanıcı adı ya da şifre");
			}*/
			
			
		}
	
}
