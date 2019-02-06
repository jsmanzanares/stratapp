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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.waitForElementClickable(findTestObject('MENU/IDEATION_TAB'), 60)

WebUI.mouseOver(findTestObject('MENU/IDEATION_TAB'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MENU/IDEATION_TAB'))

WebUI.waitForElementPresent(findTestObject('IDEATION/TABS/IDEAS_TAB'), 60)

WebUI.mouseOver(findTestObject('IDEATION/TABS/IDEAS_TAB'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IDEATION/TABS/IDEAS_TAB'))

WebUI.waitForElementClickable(findTestObject('IDEATION/IDEAS/LV_PLUS_SIGN_BUTTON'), 60)

WebUI.mouseOver(findTestObject('IDEATION/IDEAS/LV_PLUS_SIGN_BUTTON'))

WebUI.click(findTestObject('IDEATION/IDEAS/LV_PLUS_SIGN_BUTTON'))

WebUI.click(findTestObject('IDEATION/IDEAS/LV_ADD_IDEA_BUTTON'))

WebUI.setText(findTestObject('IDEATION/IDEAS/OC_TITLE_TEXTFIELD'), IDEA_TITLE)

WebUI.sendKeys(findTestObject('IDEATION/IDEAS/OC_TITLE_TEXTFIELD'), Keys.chord(Keys.TAB))


WebUI.waitForElementVisible(findTestObject('IDEATION/IDEAS/OC_STATUS_FIELD'), 0)

WebUI.mouseOver(findTestObject('IDEATION/IDEAS/OC_STATUS_FIELD'))

WebUI.click(findTestObject('IDEATION/IDEAS/OC_STATUS_FIELD'))

WebUI.waitForElementVisible(findTestObject('IDEATION/IDEAS/OC_STATUS_DROPDOWN'), 60)

CustomKeywords.'stratapp.Dropdown.Select'(findTestObject('IDEATION/IDEAS/OC_STATUS_DROPDOWN'), IDEA_STATUS)

WebUI.mouseOver(findTestObject('IDEATION/IDEAS/OC_IMPORTANCE_FIELD'))

WebUI.click(findTestObject('IDEATION/IDEAS/OC_IMPORTANCE_FIELD'))

CustomKeywords.'stratapp.Dropdown.Select'(findTestObject('IDEATION/IDEAS/OC_IMPORTANCE_DROPDOWN'), IDEA_IMPORTANCE)

WebUI.mouseOver(findTestObject('IDEATION/IDEAS/OC_SECURITY_FIELD'))

WebUI.click(findTestObject('IDEATION/IDEAS/OC_SECURITY_FIELD'))

CustomKeywords.'stratapp.Dropdown.Select'(findTestObject('IDEATION/IDEAS/OC_SECURITY_DROPDOWN'), IDEA_SECURITY)

WebUI.mouseOver(findTestObject('IDEATION/IDEAS/OC_SOURCE_FIELD'))

WebUI.click(findTestObject('IDEATION/IDEAS/OC_SOURCE_FIELD'))

WebUI.mouseOver(findTestObject('IDEATION/IDEAS/OC_SOURCE_TYPE_BUTTON'))

WebUI.click(findTestObject('IDEATION/IDEAS/OC_SOURCE_TYPE_BUTTON'))

WebUI.waitForElementVisible(findTestObject('IDEATION/IDEAS/OC_STATUS_DROPDOWN'), 60)

CustomKeywords.'stratapp.Dropdown.AddSource'(findTestObject('IDEATION/IDEAS/OC_SOURCE_DROPDOWN'), IDEA_SOURCE)

WebUI.mouseOver(findTestObject('IDEATION/LV2 NAV/THE_IDEA_CHALLENGE/OC_ADD_EDIT_CONTENT_BUTTON'))

WebUI.click(findTestObject('IDEATION/LV2 NAV/THE_IDEA_CHALLENGE/OC_ADD_EDIT_CONTENT_BUTTON'))

WebUI.waitForElementVisible(findTestObject('IDEATION/LV2 NAV/THE_IDEA_CHALLENGE/OC_SUMMARY_TEXTAREA'), 60)

WebUI.mouseOver(findTestObject('IDEATION/LV2 NAV/THE_IDEA_CHALLENGE/OC_SUMMARY_TEXTAREA'))

WebUI.click(findTestObject('IDEATION/LV2 NAV/THE_IDEA_CHALLENGE/OC_SUMMARY_TEXTAREA'))

CustomKeywords.'stratapp.NonInput.SendKeys'(findTestObject('IDEATION/LV2 NAV/THE_IDEA_CHALLENGE/OC_SUMMARY_TEXTAREA'), IDEA_SUMMARY)

WebUI.mouseOver(findTestObject('IDEATION/LV2 NAV/THE_IDEA_CHALLENGE/OC_SAVE_BUTTON'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('IDEATION/LV2 NAV/THE_IDEA_CHALLENGE/OC_SAVE_BUTTON'))

WebUI.waitForElementVisible(findTestObject('IDEATION/LV2 NAV/THE_IDEA_CHALLENGE/OC_SUMMARY_PARAGRAPH'), 60)

WebUI.verifyElementText(findTestObject('IDEATION/IDEAS/OC_STATUS_FIELD'), IDEA_STATUS.toUpperCase(), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('IDEATION/IDEAS/OC_IMPORTANCE_FIELD'), IDEA_IMPORTANCE, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('IDEATION/IDEAS/OC_SECURITY_FIELD'), IDEA_SECURITY, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('IDEATION/IDEAS/OC_USERNAME_LINK'), GlobalVariable.UserName, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('IDEATION/LV2 NAV/THE_IDEA_CHALLENGE/OC_SUMMARY_PARAGRAPH'), IDEA_SUMMARY, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('IDEATION/IDEAS/OC_CLOSE_BUTTON'))

WebUI.click(findTestObject('IDEATION/IDEAS/OC_CLOSE_BUTTON'))

WebUI.setText(findTestObject('IDEATION/IDEAS/LV_SEARCH_TEXTFIELD'), IDEA_TITLE)

WebUI.waitForElementPresent(findTestObject('IDEATION/IDEAS/LV_IDEA_TITLE'), 60)

WebUI.verifyElementText(findTestObject('IDEATION/IDEAS/LV_IDEA_TITLE'), IDEA_TITLE)

WebUI.verifyElementText(findTestObject('IDEATION/IDEAS/LV_STATUS_FIELD'), IDEA_STATUS.toUpperCase())

WebUI.verifyElementText(findTestObject('IDEATION/IDEAS/LV_IMPORTANCE_FIELD'), IDEA_IMPORTANCE)

