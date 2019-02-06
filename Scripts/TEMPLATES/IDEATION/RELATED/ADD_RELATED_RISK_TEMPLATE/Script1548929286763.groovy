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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.mouseOver(findTestObject('IDEATION/LV2 NAV/RELATED/RELATED_TAB'))

WebUI.click(findTestObject('IDEATION/LV2 NAV/RELATED/RELATED_TAB'))

WebUI.waitForElementVisible(findTestObject('IDEATION/LV2 NAV/RELATED/RISKS/RELATED_RISKS_TAB'), 60)

WebUI.mouseOver(findTestObject('IDEATION/LV2 NAV/RELATED/RISKS/RELATED_RISKS_TAB'))

WebUI.click(findTestObject('IDEATION/LV2 NAV/RELATED/RISKS/RELATED_RISKS_TAB'))

WebUI.waitForElementVisible(findTestObject('IDEATION/LV2 NAV/RELATED/RISKS/OC_ADD_RISK_BUTTON'), 60)

WebUI.mouseOver(findTestObject('IDEATION/LV2 NAV/RELATED/RISKS/OC_ADD_RISK_BUTTON'))

WebUI.click(findTestObject('IDEATION/LV2 NAV/RELATED/RISKS/OC_ADD_RISK_BUTTON'))

WebUI.waitForElementVisible(findTestObject('STRATEGY/RISKS/OC_RISK_TITLE_FIELD'), 60)

WebUI.setText(findTestObject('STRATEGY/RISKS/OC_RISK_TITLE_FIELD'), RISK_TITLE)

WebUI.sendKeys(findTestObject('STRATEGY/RISKS/OC_RISK_TITLE_FIELD'), Keys.chord(Keys.ENTER), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('STRATEGY/RISKS/OC_RISK_STATUS_FIELD'), 60)

WebUI.mouseOver(findTestObject('STRATEGY/RISKS/OC_RISK_STATUS_FIELD'))

WebUI.click(findTestObject('STRATEGY/RISKS/OC_RISK_STATUS_FIELD'))

CustomKeywords.'stratapp.Dropdown.Select'(findTestObject('STRATEGY/RISKS/OC_RISK_STATUS_DROPDOWN'), RISK_STATUS)

WebUI.mouseOver(findTestObject('STRATEGY/RISKS/OC_RISK_SECURITY_FIELD'))

WebUI.click(findTestObject('STRATEGY/RISKS/OC_RISK_SECURITY_FIELD'))

CustomKeywords.'stratapp.Dropdown.Select'(findTestObject('STRATEGY/RISKS/OC_RISK_SECURITY_DROPDOWN'), RISK_SECURITY)

WebUI.mouseOver(findTestObject('STRATEGY/RISKS/OC_RISK_PROBABILITY_FIELD'))

WebUI.click(findTestObject('STRATEGY/RISKS/OC_RISK_PROBABILITY_FIELD'))

CustomKeywords.'stratapp.Dropdown.Select'(findTestObject('STRATEGY/RISKS/OC_RISK_PROBABILITY_DROPDOWN'), RISK_PROBABILITY)

WebUI.mouseOver(findTestObject('STRATEGY/RISKS/OC_RISK_IMPACT_FIELD'))

WebUI.click(findTestObject('STRATEGY/RISKS/OC_RISK_IMPACT_FIELD'))

CustomKeywords.'stratapp.Dropdown.Select'(findTestObject('STRATEGY/RISKS/OC_RISK_IMPACT_DROPDOWN'), RISK_IMPACT)

WebUI.verifyElementText(findTestObject('STRATEGY/RISKS/OC_RISK_STATUS_FIELD'), RISK_STATUS.toUpperCase())

WebUI.verifyElementText(findTestObject('STRATEGY/RISKS/OC_RISK_SECURITY_FIELD'), RISK_SECURITY)

String impact = WebUI.getText(findTestObject('STRATEGY/RISKS/OC_RISK_IMPACT_FIELD'), FailureHandling.CONTINUE_ON_FAILURE)

String probability = WebUI.getText(findTestObject('STRATEGY/RISKS/OC_RISK_PROBABILITY_FIELD'), FailureHandling.CONTINUE_ON_FAILURE)

String source = WebUI.getText(findTestObject('STRATEGY/RISKS/OC_RISK_SOURCE_LINK'), FailureHandling.CONTINUE_ON_FAILURE)

//KeywordUtil.logInfo('.....' + source)
if (impact.contains(RISK_IMPACT)) {
    //assert true
    KeywordUtil.markPassed('Actual: ' + impact + ' ; Expected: ' + RISK_IMPACT)
} else {
    //assert false
	KeywordUtil.markFailed('Actual: ' + impact + ' ; Expected: ' + RISK_IMPACT)
}

if (probability.contains(RISK_PROBABILITY)) {
    //assert true
	KeywordUtil.markPassed('Actual: ' + probability + ' ; Expected: ' + RISK_PROBABILITY)
} else {
    //assert false
	KeywordUtil.markFailed('Actual: ' + probability + ' ; Expected: ' + RISK_PROBABILITY)
}

if (source.contains(SOURCE_TITLE)) {
    //assert true
	KeywordUtil.markPassed('Actual: ' + source + ' ; Expected: ' + SOURCE_TITLE)
} else {
    //assert false
	KeywordUtil.markFailed('Actual: ' + source + ' ; Expected: ' + SOURCE_TITLE)
}

WebUI.click(findTestObject('STRATEGY/RISKS/OC_RISK_CLOSE_BUTTON'))

WebUI.waitForElementVisible(findTestObject('IDEATION/LV2 NAV/RELATED/RISKS/OC_RISK_RELATED_TITLE_LINK'), 60)

WebUI.verifyElementText(findTestObject('IDEATION/LV2 NAV/RELATED/RISKS/OC_RISK_RELATED_TITLE_LINK'), RISK_TITLE)

WebUI.verifyElementText(findTestObject('IDEATION/LV2 NAV/RELATED/RISKS/OC_RISK_RELATED_STATUS_FIELD'), RISK_STATUS.toUpperCase())

WebUI.delay(10)

