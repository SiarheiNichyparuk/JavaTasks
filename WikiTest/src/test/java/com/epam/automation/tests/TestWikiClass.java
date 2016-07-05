package com.epam.automation.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.epam.automation.pages.SearchResultPage;
import com.epam.automation.pages.StartPage;
import com.epam.automation.pages.WelcomePage;

public class TestWikiClass {

	private final String TEXT = "Death";
	private final String WRONG_TEXT = "Kvaziunofantastika";
	private final String NONE_FOUND_MESSAGE = "Соответствий запросу не найдено.";

	@Test(priority = 1)
	public void firstTestWiki() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		StartPage startPage = new StartPage(driver);
		startPage.open();
		WelcomePage welcomePage = startPage.chooseLanguage();
		SearchResultPage searchResultPage = welcomePage.search(TEXT);
		String actualText1 = searchResultPage.compareText();
		System.out.println(actualText1);
		Assert.assertEquals(TEXT, actualText1);
		driver.close();
	}

	@Test(priority = 2)
	public void secondTestWiki() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		StartPage startPage = new StartPage(driver);
		startPage.open();
		WelcomePage welcomePage = startPage.chooseLanguage();
		SearchResultPage searchResultPage = welcomePage.search(WRONG_TEXT);
		String actualText2 = searchResultPage.compareWrongText();
		System.out.println(actualText2);
		Assert.assertEquals(NONE_FOUND_MESSAGE, actualText2);
		driver.close();
	}

}
