package PageObjects;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Stctv_Steps  {
	
	@FindBy(how=How.ID, using="country") public WebElement Country;
	@FindBy(how=How.ID, using="sa-contry-lable") public WebElement KSA;
	@FindBy(how=How.XPATH, using="//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[2]") public WebElement KSAClassic;
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div[3]/div/div/div/div[2]/div[2]/div[2]/div[2]") public WebElement PriceandCurrencyKSADiscovery;
	@FindBy(how=How.ID, using="currency-classic") public WebElement PriceandCurrencyKSA;

	
	
	@FindBy(how=How.ID, using="kw-contry-lable") public WebElement Kuwait;
	@FindBy(how=How.ID, using="currency-classic") public WebElement PriceandCurrencyKuwait;
	
	@FindBy(how=How.ID, using="bh-contry-lable") public WebElement Bahrain;
	@FindBy(how=How.ID, using="currency-classic") public WebElement PriceandCurrencyBahrain;

	
	
	
	WebDriver driver ; 

	public Stctv_Steps(WebDriver driver) 


	{
		this.driver=driver;
	}
	
	
	
	public void Search_Assert () throws FileNotFoundException, IOException, ParseException, InterruptedException{
		
		
		//new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(By.id("__tab_V33TC_V39TP1")));
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		Country.click();
		KSA.click();
		

		// Validate the Subscription Packages – Type & Price and Currency
		String KSAPriceCurrency = PriceandCurrencyKSA.getText();
		Assert.assertEquals(KSAPriceCurrency,"25 SAR/month");
		System.out.println("KSA CLASSIC Price "+KSAPriceCurrency);
		
		
		// Scroll Down
		Actions actions = new Actions(driver);
		actions.moveToElement(KSAClassic);
		actions.perform();
		
		
		String KSAdiscovery = PriceandCurrencyKSADiscovery.getText();
		Assert.assertEquals(KSAdiscovery,"17.25 SAR/month");
		System.out.println("KSA Discovery Price "+KSAdiscovery);
		
		
		
		//////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////
		Country.click();
		Kuwait.click();
		
		// Validate the Subscription Packages – Type & Price and Currency
				String KuwaitPriceCurrency = PriceandCurrencyKuwait.getText();
				Assert.assertEquals(KuwaitPriceCurrency,"2.5 KWD/month");
				System.out.println("Kuwait CLASSIC Price "+ KuwaitPriceCurrency);
		
		
		//////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////
				
				
				
		Country.click();
		Bahrain.click();
				
		// Validate the Subscription Packages – Type & Price and Currency
		String BahrainPriceCurrency = PriceandCurrencyKuwait.getText();
		Assert.assertEquals(BahrainPriceCurrency,"3 BHD/month");
		System.out.println("Bahrain CLASSIC Price "+ BahrainPriceCurrency);
		
		/*
		// Validating if the Price with currency are displayed or not
				//if(PriceandCurrencyKSA.isDisplayed())
				//{
				System.out.println(PriceandCurrencyKSA.getText());
				//}else{
				System.out.println("No Price written");
				}
		
		
	
}
	*/

	}}

