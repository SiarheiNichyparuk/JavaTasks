package com.epam.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class StartPage {

	public static final String BASE_URL = "https://www.wikipedia.org";

	@FindBy(id = "js-link-box-ru")
	private WebElement russLanguageButton;

	private WebDriver driver;

	public StartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void open() {
		driver.navigate().to(BASE_URL);
	}

	public WelcomePage chooseLanguage() {
		russLanguageButton.click();
		return new WelcomePage(driver);

	}
}
