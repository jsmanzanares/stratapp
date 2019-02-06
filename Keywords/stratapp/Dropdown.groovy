package stratapp

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By.ByXPath
import org.openqa.selenium.By;
import org.openqa.selenium.Keys

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.logging.KeywordLogger

public class Dropdown {

	WebDriver driver = DriverFactory.getWebDriver();
	//KeywordLogger log = new KeywordLogger();

	@Keyword
	def Select (TestObject obj, String sInput) {

		String objX = obj.findProperty("xpath").getValue();
		WebElement element = driver.findElement(By.xpath(objX));
		List<WebElement> list = element.findElements(By.xpath("./div"));
		Boolean flag = false;
		for (WebElement ele : list)
		{
			if(sInput == ele.getText())
			{
				ele.click();
				flag = true;
				break;
			}

		}

		if(flag)
			KeywordUtil.logInfo(sInput + ' is not part of dropdown list');


	}

	@Keyword
	def AddSource (TestObject obj, String sInput)
	{
		String objX = obj.findProperty("xpath").getValue();
		WebElement element = driver.findElement(By.xpath(objX));
		List<WebElement> list = element.findElements(By.xpath(".//span"));
		String[] inputArr = sInput.split("~");
		String sourceType = inputArr[0];
		String source = inputArr[1];

		for (WebElement ele : list)
		{
			if(ele.getText().contains(sourceType))
			{
				ele.click();
				KeywordUtil.logInfo(ele.getText() + ' selected');
				break;
			}
		}

		WebElement searchSource = driver.findElement(By.xpath("//p-autocomplete//input[contains(@placeholder,'search')]"));
		searchSource.click();
		searchSource.sendKeys(source);
		WebUI.delay(5);
		searchSource.sendKeys(Keys.chord(Keys.DOWN));
		searchSource.sendKeys(Keys.chord(Keys.TAB));

		WebElement checkButton = driver.findElement(By.xpath("//i[@class='fa fa-check small']"));

		checkButton.click();
	}
	
	@Keyword
	def SelectMember (TestObject obj, String name)
	{
		String objX = obj.findProperty("xpath").getValue();
		WebElement element = driver.findElement(By.xpath(objX));
		List<WebElement> list = element.findElements(By.xpath(".//span"));
		Boolean flag = false;
		
		for (WebElement ele : list)
		{
			if(ele.getText() == name)
			{
				ele.click();
				flag = true;
				break;
			}
		}
		
		if(flag)
		KeywordUtil.logInfo(sInput + ' is not part of dropdown list');
	}
	
	
}
