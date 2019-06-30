package com.github.kripaliz.testing.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.kripaliz.automation.pageobject.AbstractPage;
import com.github.kripaliz.automation.pageobject.PageObject;
import com.github.kripaliz.testing.constant.AnukoHomePageConstants;
import com.github.kripaliz.testing.data.TestEnvironment;

/**
 * @author kkurian
 *
 */
@PageObject
public class AnukoHomePage extends AbstractPage{

	@Autowired
	private TestEnvironment testEnvironment;
	
	@FindBy(css = AnukoHomePageConstants.LOGIN_LINK_CSS)
	private WebElement loginLink;
	
	public void visitUrl() {
		webDriver.get(testEnvironment.getUrl());
	}

	public void clickOnLoginLink() {
		waitForElement(loginLink, 50);
		loginLink.click();
	}

}
