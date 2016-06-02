package com.epam.automation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.epam.automation.pages.HomePage;

public class SampleJUnitTest extends JUnitTestBase {
	private static final String USER_1 = "CrazyRabbit322";
	private static final String USER_1_PASSWD = "H3jAZmc09j7";
	private static final String USER_2 = "sergeseger";
	private static final String USER_2_PASSWD = "sergesege";



  @Test
  public void testHomePageHasAHeader() {
	  WebDriver driver = new FirefoxDriver();
	  driver.navigate().to("http://www.gmail.com");
	  WebElement login = driver.findElement(By.id("Email"));
	  login.click();
	  login.sendKeys(USER_1);
	  login.submit();
	  WebElement next = driver.findElement(By.id("next"));
	  next.click();
	  WebElement password = driver.findElement(By.id("Passwd"));
	  password.click();
	  password.sendKeys(USER_1_PASSWD);
	  WebElement signIn = driver.findElement(By.id("signIn"));
	  signIn.click();
	  WebElement write = driver.findElement(By.xpath("//div[@class='z0']"));
	  write.click();
	  WebElement to = driver.findElement(By.xpath("//textarea[@id=:9n]"));
	  to.click();
	  to.sendKeys(USER_2);
	  to.submit();
	  
	 //driver.quit();
    //Assert.assertFalse("".equals(homepage.header.getText()));
  }
}
