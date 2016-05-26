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
	private static final String USER_1 = "TestAccount";



  @Test
  public void testHomePageHasAHeader() {
	  WebDriver driver = new FirefoxDriver();
	  driver.navigate().to("http://www.gmail.com");
	  WebElement mailString = driver.findElement(By.name("service"));
	  mailString.click();
	  
	  
	 
    //Assert.assertFalse("".equals(homepage.header.getText()));
  }
}
