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

WebUI.waitForElementPresent(findTestObject('MENU/IDEATION_TAB'), 60)

WebUI.mouseOver(findTestObject('MENU/IDEATION_TAB'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MENU/IDEATION_TAB'))

WebUI.waitForElementPresent(findTestObject('IDEATION/TABS/IDEAS_TAB'), 60)

WebUI.mouseOver(findTestObject('IDEATION/TABS/IDEAS_TAB'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IDEATION/TABS/IDEAS_TAB'))

WebUI.waitForElementPresent(findTestObject('IDEATION/IDEAS/LV_PLUS_SIGN_BUTTON'), 60)

WebUI.setText(findTestObject('IDEATION/IDEAS/LV_SEARCH_TEXTFIELD'), IDEA_TITLE)

WebUI.waitForElementPresent(findTestObject('IDEATION/IDEAS/LV_IDEA_TITLE'), 60)

WebUI.mouseOver(findTestObject('IDEATION/IDEAS/LV_IDEA_TITLE'))

WebUI.click(findTestObject('IDEATION/IDEAS/LV_IDEA_TITLE'))

WebUI.waitForElementVisible(findTestObject('IDEATION/IDEAS/IDEA_CARD'), 60)

WebUI.mouseOver(findTestObject('COMMON/OPEN_CARD/OC_MEMBERS_BUTTON'))

WebUI.click(findTestObject('COMMON/OPEN_CARD/OC_MEMBERS_BUTTON'))

WebUI.setText(findTestObject('COMMON/MEMBERS/SEACH_NAME_TEXTAREA'), MEMBER_NAME)

WebUI.waitForElementClickable(findTestObject('COMMON/MEMBERS/ADD_BUTTON'), 60)

WebUI.click(findTestObject('COMMON/MEMBERS/ADD_BUTTON'))

WebUI.waitForElementVisible(findTestObject('COMMON/MEMBERS/REMOVE_BUTTON'), 60)

CustomKeywords.'stratapp.Members.VerifyMember'(MEMBER_NAME, MEMBER_ROLES)

WebUI.mouseOver(findTestObject('COMMON/OPEN_CARD/OC_CLOSE_BUTTON'))

WebUI.click(findTestObject('COMMON/OPEN_CARD/OC_CLOSE_BUTTON'))
GlobalVariable.Inviter = GlobalVariable.UserName

