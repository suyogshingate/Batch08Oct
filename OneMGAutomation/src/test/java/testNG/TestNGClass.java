package testNG;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pomClasses.AyurvedaCartPage;
import pomClasses.AyurvedaLoginPopUpPage;
import pomClasses.AyurvedaMainPage;
import pomClasses.AyurvedaMedicineProductPage;
import pomClasses.AyurvedaMedicineSearchResultPage;
import pomClasses.HomeOrMainPage;
import pomClasses.HomePagePopUps;
import pomClasses.PatanjaliPage;

public class TestNGClass {
	WebDriver driverT;
//	@BeforeSuite
//	public void beforeSuite() {
//		System.out.println("Before Class");
//	}
//	
//	@BeforeTest
//	public void beforeTest() {
//		System.out.println("Before Class");
//	}
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver_win32 (3)\\chromedriver.exe");
		driverT = new ChromeDriver();
		driverT.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverT.manage().window().maximize();
		
	}
	
	@BeforeMethod 
	public void openHomeOrMainPage() throws InterruptedException {
		System.out.println("Before Method");
		driverT.get("https://www.1mg.com");
		
	}
	
	@Test (enabled = true)
	public void handlePopUpsT1() throws InterruptedException {
		System.out.println("Test T1");
		HomePagePopUps homePagePopUps = new HomePagePopUps(driverT);
		homePagePopUps.clickOnCloseAd();
		homePagePopUps.clickOnUpdateButton();
		Thread.sleep(2000);
		//check URL
	}
	
	@Test (enabled = true, dependsOnMethods = {"handlePopUpsT1"})
	public void goToAyurvedaPageT2() throws InterruptedException {
		System.out.println("Test T2");
		HomeOrMainPage homeOrMainPage = new HomeOrMainPage(driverT);
		homeOrMainPage.clickOnAyurveda();
		
		Thread.sleep(2000);
		//check URL
	}
	
	@Test (enabled = true, dependsOnMethods = {"goToAyurvedaPageT2"})
	public void testCase1A1() throws InterruptedException {
		System.out.println("Test 1A1");
		
		ArrayList<String> addr = new ArrayList<String>(driverT.getWindowHandles());
		driverT.switchTo().window(addr.get(1));
		
		AyurvedaMainPage ayurvedaMainPage = new AyurvedaMainPage(driverT);
		ayurvedaMainPage.typeCityNameAndEnter();
		ayurvedaMainPage.typeAyurMedNameAndEnter();
		Thread.sleep(2000);
		//get text city name
		//get text med name
	}
	
	@Test (enabled = true, dependsOnMethods = {"testCase1A1"})
	public void testCase1A2() throws InterruptedException {
		System.out.println("Test 1A2");
		
		ArrayList<String> addr = new ArrayList<String>(driverT.getWindowHandles());
		driverT.switchTo().window(addr.get(1));
		
		AyurvedaMedicineSearchResultPage ayurvedaMedicineSearchResultPage = new AyurvedaMedicineSearchResultPage(driverT);
		ayurvedaMedicineSearchResultPage.firstOptionSelection();
		
		
		//check URL
	}
	
	@Test (enabled = true, dependsOnMethods = {"handlePopUpsT1","goToAyurvedaPageT2", "testCase1A1","testCase1A2"}, priority = 1)
	public void testCase1A3() throws InterruptedException {
		
		ArrayList<String> addr1 = new ArrayList<String>(driverT.getWindowHandles());
		driverT.switchTo().window(addr1.get(1));
		Thread.sleep(2000);
		
		System.out.println("Test 1A3");	
		AyurvedaMedicineProductPage ayurvedaMedicineProductPage = new AyurvedaMedicineProductPage(driverT);

		ayurvedaMedicineProductPage.clickOnAddToCart();
		
		ayurvedaMedicineProductPage.clickOnProceedToCartIcon();
		//get text before adding and after adding
		
		//get url
	}
	
	@Test (enabled = true, dependsOnMethods = {"testCase1A3"})
	public void testCase1A4() throws InterruptedException {
		System.out.println("Test 1A4");	
		
		ArrayList<String> addr1 = new ArrayList<String>(driverT.getWindowHandles());
		driverT.switchTo().window(addr1.get(1));
		Thread.sleep(2000);

		AyurvedaCartPage ayurvedaCartPage = new AyurvedaCartPage(driverT);
		ayurvedaCartPage.checkTheSilverPackage();
		//is selected for package
	}
	
	
	
	//=====================================================================================
	
	
	
	@Test (enabled = false, priority = 6, dependsOnMethods = {"testCase1A2"})
	public void testCase1B1() throws InterruptedException {
		System.out.println("Test 1B1");	
		
		HomeOrMainPage homeOrMainPage = new HomeOrMainPage(driverT);
		homeOrMainPage.clickOnAyurveda();
		ArrayList<String> addr = new ArrayList<String>(driverT.getWindowHandles());
		driverT.switchTo().window(addr.get(3));
		
		//current URL
	}
	
	@Test (enabled = false, priority = 7, dependsOnMethods = {"testCase1B1"})
	public void testCase1B2() throws InterruptedException {
		System.out.println("Test 1B2");

		AyurvedaMainPage ayurvedaMainPage = new AyurvedaMainPage(driverT);
		ayurvedaMainPage.hoverOnAyurvedaProducts();
		// is displayed Patanjali
		ayurvedaMainPage.clickOnPatanjaliLink();
	}
	
	@Test (enabled = false, priority = 8, dependsOnMethods = {"testCase1B2"})
	public void testCase1B3() throws InterruptedException {
		System.out.println("Test 1B3");	
		PatanjaliPage patanjaliPage = new PatanjaliPage(driverT);
		patanjaliPage.clickOnPatanCheckBox();
		//is selected method
//		patanjaliPage.clickOnSortOption();
//		patanjaliPage.selectHighToLow();
		Thread.sleep(2000);
		Thread.sleep(2000);

	}
	
	@Test (enabled = false, priority = 9, dependsOnMethods = {"testCase1B3"})
	public void testCase1B4() throws InterruptedException {
		System.out.println("Test 1B4");	
		
		PatanjaliPage patanjaliPage = new PatanjaliPage(driverT);
		patanjaliPage.addMed1();
		patanjaliPage.addMed2();
		patanjaliPage.clickOnProceedToCartIcon();
		//get text

	}
	
	@Test (enabled = true, dependsOnMethods = {"testCase1A3"})
	public void testCaseT3() throws InterruptedException {
		System.out.println("Test T3");
		
		AyurvedaCartPage ayurvedaCartPage = new AyurvedaCartPage(driverT);
		ayurvedaCartPage.clickOnCheckoutButton();

	}
	
	@Test (enabled = true, dependsOnMethods = {"testCaseT3"}, priority = 1)
	public void testCaseT4() throws InterruptedException {
		System.out.println("Test T4");
		
		AyurvedaLoginPopUpPage ayurvedaLoginPopUpPage = new AyurvedaLoginPopUpPage(driverT);
		ayurvedaLoginPopUpPage.enterMobileNumber();
		ayurvedaLoginPopUpPage.clickOnContinueButton();

	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
		driverT.quit();
	} 
	
//	@AfterTest
//	public void afterTest() {
//		System.out.println("After Method");
//	}
//	
//	@AfterSuite
//	public void afterSuite() {
//		System.out.println("After Class");
//	} 


}
