package Tests;

import org.testng.annotations.BeforeSuite;


import utility.ConstantUrl;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;

public class TestBase_Stctv extends ConstantUrl {
	
 public static WebDriver driver= null;
  @BeforeSuite
  public void Intilize() throws IOException{
	  //String cwd = System.getProperty("user.dir");
      //System.out.println("Current working directory : " + cwd);
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("\\src\\test\\java\\Drivers\\chromedriver.exe"));
	  driver = new ChromeDriver() ;
	  driver.manage().window().maximize();	
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);	
	  driver.get(URL);
   
	  
  }
  
  

  
  
  public void toWait(By ByObject) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ByObject));
	}
  
  
  
  @AfterSuite
  public void teerDownTest() {
	//driver.quit();
  }
  
}

