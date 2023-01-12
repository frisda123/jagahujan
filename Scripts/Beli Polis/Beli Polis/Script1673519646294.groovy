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

WebUI.navigateToUrl('https://jagahujan.ptape.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Beli Polis/a_Beli Sekarang'))

WebUI.setText(findTestObject('Object Repository/Beli Polis/input__input-213'), '1216625607000021')

WebUI.setText(findTestObject('Object Repository/Beli Polis/input__input-216'), 'Frisda')

WebUI.click(findTestObject('Object Repository/Beli Polis/input__input-220'))

WebUI.click(findTestObject('Object Repository/Beli Polis/li_2001'))

WebUI.click(findTestObject('Object Repository/Beli Polis/button_Jul'))

WebUI.click(findTestObject('Object Repository/Beli Polis/button_16'))

WebUI.setText(findTestObject('Object Repository/Beli Polis/textarea__input-7-4'), 'Jakarta Selatan')

WebUI.setText(findTestObject('Object Repository/Beli Polis/input__input-226'), '82167906144')

WebUI.scrollToElement(findTestObject('Beli Polis/span_Selanjutnya'), 5)

WebUI.click(findTestObject('Object Repository/Beli Polis/div__v-input--selection-controls__ripple'))

WebUI.setText(findTestObject('Object Repository/Beli Polis/input__input-237'), 'frisda.sianipar@gmail.com')

WebUI.click(findTestObject('Object Repository/Beli Polis/input__input-240'))

WebUI.click(findTestObject('Object Repository/Beli Polis/div_Perempuan'))

WebUI.click(findTestObject('Object Repository/Beli Polis/input__input-245'))

WebUI.click(findTestObject('Object Repository/Beli Polis/div_DKI Jakarta'))

WebUI.click(findTestObject('Object Repository/Beli Polis/input__input-250'))

WebUI.click(findTestObject('Object Repository/Beli Polis/div_KOTA JAKARTA SELATAN'))

WebUI.click(findTestObject('Object Repository/Beli Polis/span_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/Beli Polis/div_17'))

WebUI.click(findTestObject('Object Repository/Beli Polis/div_18'))

WebUI.click(findTestObject('Object Repository/Beli Polis/i_Motor_v-icon notranslate mdi mdi-circle-s_2e14ac'))

WebUI.scrollToElement(findTestObject('Beli Polis/button_Selesaikan Pembelian'), 5)

WebUI.click(findTestObject('Object Repository/Beli Polis/button_Selesaikan Pembelian'))

WebUI.click(findTestObject('Object Repository/Beli Polis/div_Virtual Account'))

WebUI.click(findTestObject('Object Repository/Beli Polis/div_BCA_v-input--selection-controls__ripple'))

WebUI.click(findTestObject('Object Repository/Beli Polis/div_Bina_v-input--selection-controls__ripple'))

WebUI.scrollToElement(findTestObject('Beli Polis/button_Bayar Sekarang'), 5)

WebUI.click(findTestObject('Object Repository/Beli Polis/button_Bayar Sekarang'))

WebUI.scrollToElement(findTestObject('Beli Polis/button_Selesai'), 5)

WebUI.click(findTestObject('Object Repository/Beli Polis/button_Selesai'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Beli Polis/span_Satu langkah lagi pembelian kamu berhasil'), 
    0)

WebUI.click(findTestObject('Object Repository/Beli Polis/a_Kembali Ke Home'))

//WebUI.click(findTestObject('Object Repository/Beli Polis/a_Beli Sekarang'))

WebUI.closeBrowser()

