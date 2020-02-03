import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com/?gws_rd=ssl')

WebUI.setText(findTestObject('Object Repository/Page_Google/input_Complete_q'), 'slk software')

WebUI.click(findTestObject('Object Repository/Page_Google/div_emcaemcatemcavsbfciblpcA8SBwfpositionre_72aaef'))

WebUI.click(findTestObject('Object Repository/Page_Google/input_Remove_btnK'))

WebUI.click(findTestObject('Object Repository/Page_slk software - Google Search/h3_SLK Software'))

WebUI.click(findTestObject('Object Repository/Page_SLK Software/a_About Us'))

WebUI.click(findTestObject('Object Repository/Page_SLK Software/a_Intelligent Business Transformation'))

WebUI.click(findTestObject('Object Repository/Page_SLK Software/a_Agile IT Automation'))

WebUI.click(findTestObject('Object Repository/Page_SLK Software/a_Products and Platforms'))

WebUI.click(findTestObject('Object Repository/Page_SLK Software/a_Industries'))

WebUI.click(findTestObject('Object Repository/Page_SLK Software/a_Supply Chain'))

WebUI.click(findTestObject('Object Repository/Page_SLK Software/a_Banking'))

WebUI.closeBrowser()

