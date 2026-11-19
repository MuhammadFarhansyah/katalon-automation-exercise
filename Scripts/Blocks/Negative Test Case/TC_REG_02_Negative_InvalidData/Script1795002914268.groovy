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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.automationexercise.com/login')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_New User Signup_name'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_New User Signup_name'), 'testpositif')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_New User Signup_name'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_New User Signup_email'), 
    'positif@gmail.com')

WebUI.sendKeys(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_New User Signup_email'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Register/input_Mr_id_gender1'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input__password'), 'iGDxf8hSRT4=')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Day123456789101112131415161718192021_40ab5b'), 
    '13', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_MonthJanuaryFebruaryMarchAprilMayJun_aa9ebb'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Year20212020201920182017201620152014_f874ed'), 
    '2012', true)

WebUI.click(findTestObject('Object Repository/Page_Register/input_Date of Birth_newsletter'))

WebUI.click(findTestObject('Object Repository/Page_Register/input_Sign up for our newsletter_optin'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input__first_name'), 'Awas')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__last_name'), 'Zawa')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Company_company'), 'Atas')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_(Street address, P.O. Box, Company na_957d3e'), 
    'gara')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Address 2_address2'), 'era')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_IndiaUnited StatesCanadaAustraliaIsr_09757b'), 
    'United States', true)

WebUI.setText(findTestObject('Object Repository/Page_Register/input__state'), 'afa')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__city'), 'geta')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__zipcode'), 'cada')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__mobile_number'), '12345')

WebUI.click(findTestObject('Object Repository/Page_Register/button_Create Account'))

WebUI.closeBrowser()

