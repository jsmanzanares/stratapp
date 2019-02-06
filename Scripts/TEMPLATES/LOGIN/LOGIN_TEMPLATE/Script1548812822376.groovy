import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://app.stratapp.ai/')

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('LOGIN/EMAIL_ADD_TEXTFIELD'), 60)

WebUI.setText(findTestObject('LOGIN/EMAIL_ADD_TEXTFIELD'), EMAIL)

WebUI.click(findTestObject('LOGIN/NEXT_BUTTON'))

isGoogle = WebUI.verifyElementPresent(findTestObject('LOGIN/GOOGLE_LABEL'), 60)

if (isGoogle) {
    WebUI.setText(findTestObject('LOGIN/GOOGLE_EMAIL_TEXTFIELD'), EMAIL)

    WebUI.click(findTestObject('LOGIN/GOOGLE_NEXT_BUTTON'))

    WebUI.setMaskedText(findTestObject('LOGIN/GOOGLE_PASSWORD_TEXTFIELD'), PASSWORD)

    WebUI.click(findTestObject('LOGIN/GOOGLE_SIGNIN_BUTTON'))
}

WebUI.waitForElementPresent(findTestObject('HOME/HEADLINES_TAB'), 60)

CustomKeywords.'stratapp.Login.GetUserName'()

