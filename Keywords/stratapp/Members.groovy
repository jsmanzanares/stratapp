package stratapp

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Members {

	WebDriver driver = DriverFactory.getWebDriver();
	
	@Keyword
	def VerifyMember(String name, String roles) 
	{
		List<String> roleList = Arrays.asList(roles.split(";"));
		List<WebElement> nameList = driver.findElements(By.xpath("//*[contains(@class,'media card-body')]//a[@appredirectprofile]"));
		boolean flag = false;
		for (WebElement ele : nameList)
		{
			if(isMember(ele, name))
			{
				if (containsRole(ele, roleList))
					KeywordUtil.markPassed("Passed");
				else
				{
					KeywordUtil.markFailed(name + " does not contains the following roles: " + roleList);
					KeywordUtil.markFailed("Actual roles: " + getUserRoles(ele));
				}
				flag = true;		
			}			
		}
		
		if(!flag)
			KeywordUtil.markFailed(name + " is not a member");
	}
	
	private boolean isMember (WebElement element, String name)
	{
		if(element.getText().equalsIgnoreCase(name))
			return true;
		else
			return false;
	}
	
	private boolean containsRole(WebElement element, List<String> roles)
	{
		List<WebElement> roleElement = element.findElements(By.xpath("./following-sibling::div/span"));
		boolean flag = false;
		int matchedItem = 0;
		for (String r : roles)
		{
			for(WebElement ele : roleElement)
			{
				String elementText = ele.getText();
				if(elementText.equalsIgnoreCase(r))
					matchedItem++;
			}
		}
		
		return matchedItem == roles.size();
	}
	
	private String getUserRoles (WebElement element)
	{
		StringBuilder builder = new StringBuilder();
		List<WebElement> roleElement = element.findElements(By.xpath("./following-sibling::div/span"));
		for (WebElement ele : roleElement)
		{
			builder.append(ele.getText() + " ");
		}
		
		return builder.toString();
		
	}
}
