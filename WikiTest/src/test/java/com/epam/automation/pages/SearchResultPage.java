package com.epam.automation.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {

	@FindBy(id = "firstHeading")
	private WebElement heading;

	@FindBy(className = "mw-search-nonefound")
	private WebElement noneFoundMessage;

	private WebDriver driver;

	public SearchResultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String compareText() {
		String searchText = heading.getText();
		return searchText;
	}

	public String compareWrongText() {
		String nonefoundText = noneFoundMessage.getText();
		return nonefoundText;
	}

}
