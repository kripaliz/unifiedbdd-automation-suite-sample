package com.github.kripaliz.testing.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.github.kripaliz.automation.pageobject.AbstractPage;
import com.github.kripaliz.automation.pageobject.PageObject;
import com.github.kripaliz.testing.constant.AnukoLoginPageConstants;

/**
 * @author kkurian
 *
 */
@PageObject
public class AnukoLoginPage extends AbstractPage{

	@FindBy(css = AnukoLoginPageConstants.USERNAME_TEXTFIELD_CSS)
	private WebElement usernameTextfield;
	
	@FindBy(css = AnukoLoginPageConstants.PASSWORD_TEXTFIELD_CSS)
	private WebElement passwordTextfield;

	@FindBy(css = AnukoLoginPageConstants.LOGIN_BUTTON_CSS)
	private WebElement loginButton;

	public void enterUsername(String username) {
		waitForElement(usernameTextfield,10);
		usernameTextfield.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordTextfield.sendKeys(password);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

}
