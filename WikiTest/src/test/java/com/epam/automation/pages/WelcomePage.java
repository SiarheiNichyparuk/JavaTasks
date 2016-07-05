package com.epam.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	@FindBy(id = "searchInput")
	private WebElement searchInput;

	@FindBy(id = "searchButton")
	private WebElement searchButton;

	private WebDriver driver;

	public WelcomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public SearchResultPage search(String text) {
		searchInput.click();
		searchInput.sendKeys(text);
		searchButton.click();
		return new SearchResultPage(driver);

	}
}
