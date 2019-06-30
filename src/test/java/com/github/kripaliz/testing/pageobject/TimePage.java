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
public class TimePage extends AbstractPage{

	@FindBy(css = AnukoLoginPageConstants.USER_SUMMARY_DETAILS_HEADER_CSS)
	private WebElement userSummaryDetailsHeader;

	public String getUserSummaryDetailsText() {
		waitForElement(userSummaryDetailsHeader,10);
		return userSummaryDetailsHeader.getText();
	}

}
