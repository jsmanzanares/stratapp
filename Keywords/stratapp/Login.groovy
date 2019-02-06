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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import groovy.json.JsonSlurper
import internal.GlobalVariable
import jdk.nashorn.internal.parser.JSONParser
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.logging.KeywordLogger

import org.openqa.selenium.JavascriptExecutor
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.html5.LocalStorage



public class Login {

	WebDriver driver = DriverFactory.getWebDriver();
	KeywordLogger log = new KeywordLogger();

	@Keyword
	def ChooseAccount (TestObject obj, String account) {

		String objXpath = obj.findPropertyValue('xpath');
		log.logInfo(objXpath);
		List<WebElement> accounts = findTestObject(obj);
		for (WebElement element : accounts) {
			log.loInfo(element.getText());
		}
	}

	@Keyword
	def GetUserName () {
		String fullName = "";
		WebDriver driver = DriverFactory.getWebDriver()
		String user = ((JavascriptExecutor)driver).executeScript("return window.localStorage.getItem('user');")

		log.logInfo("User JSON " + user)

		JsonSlurper slurper = new JsonSlurper();
		Map parsedJson = slurper.parseText(user);
		String name = parsedJson.get("fullName");
		GlobalVariable.UserName = name;
		KeywordUtil.logInfo("Full Name: " + name);
	}
}
