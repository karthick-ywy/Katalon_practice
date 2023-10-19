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

WebUI.navigateToUrl('http://zero.webappsecurity.com/')

WebUI.click(findTestObject('Object Repository/ZeroBank/Page_Zero - Personal Banking - Loans - Cred_03e923/button_Signin'))

WebUI.setText(findTestObject('Object Repository/ZeroBank/Page_Zero - Log in/input_Login_user_login'), 'username')

WebUI.setEncryptedText(findTestObject('Object Repository/ZeroBank/Page_Zero - Log in/input_Password_user_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/ZeroBank/Page_Zero - Log in/input_Keep me signed in_submit'))

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ZeroBank/Page_Zero - Personal Banking - Loans - Cred_03e923/span_Transfer Funds'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ZeroBank/Page_Zero - Transfer Funds/select_Savings(Avail. balance   1000)      _674926'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/ZeroBank/Page_Zero - Transfer Funds/input__amount'), '500')

WebUI.setText(findTestObject('Object Repository/ZeroBank/Page_Zero - Transfer Funds/input_Description_description'), 'test transfer')

WebUI.click(findTestObject('Object Repository/ZeroBank/Page_Zero - Transfer Funds/div_Description                            _579e45'))

WebUI.setText(findTestObject('Object Repository/ZeroBank/Page_Zero - Transfer Funds/input_Description_description'), 'Test transfer')

WebUI.click(findTestObject('Object Repository/ZeroBank/Page_Zero - Transfer Funds/button_Continue'))

WebUI.click(findTestObject('Object Repository/ZeroBank/Page_Zero - Transfer Funds/button_Submit'))

