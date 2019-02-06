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

WebUI.mouseOver(findTestObject('MENU/NOTIFICATION_BUTTON'))

WebUI.click(findTestObject('MENU/NOTIFICATION_BUTTON'))

WebUI.waitForElementVisible(findTestObject('MENU/NOTIFICATION_LIST'), 60)

WebUI.verifyElementText(findTestObject('NOTIFICATION/INVITED/INVITED_BY_NAME_LINK'), GlobalVariable.Inviter)

WebUI.verifyElementText(findTestObject('NOTIFICATION/INVITED/INVITED_TO_TOPIC_TITLE_LINK'), TOPIC_TITLE)

WebUI.click(findTestObject('NOTIFICATION/INVITED/INVITED_TO_TOPIC_TITLE_LINK'))

WebUI.waitForElementVisible(findTestObject('COMMON/OPEN_CARD/OPEN_CARD'), 60)

WebUI.verifyElementVisible(findTestObject('COMMON/OPEN_CARD/OPEN_CARD'))

