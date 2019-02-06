import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.waitForElementClickable(findTestObject('MENU/PROFILE_BUTTON'), 0)

WebUI.mouseOver(findTestObject('MENU/PROFILE_BUTTON'))

WebUI.click(findTestObject('MENU/PROFILE_BUTTON'))

WebUI.waitForElementVisible(findTestObject('MENU/LOGOUT_BUTTON'), 60)

WebUI.mouseOver(findTestObject('MENU/LOGOUT_BUTTON'))

WebUI.click(findTestObject('MENU/LOGOUT_BUTTON'))

WebUI.waitForElementVisible(findTestObject('LOGIN/EMAIL_ADD_TEXTFIELD'), 60)

WebUI.closeBrowser()

