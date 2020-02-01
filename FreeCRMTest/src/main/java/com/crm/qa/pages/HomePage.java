package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	
	@FindBy(xpath="//td[contains(text(),'User: Vasant Chavan')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement ContactsLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement DealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement TasksLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public ContactsPage clickOnContactsLink() {
		ContactsLink.click();
		return new ContactsPage();
	}
	public boolean verifyCorrectUserName() {
		
		return userNameLabel.isDisplayed();
	}
	
	public DealsPage clickOnDealsLink() {
		DealsLink.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksLink() {
		TasksLink.click();
		return new TasksPage();
		
	}
}











