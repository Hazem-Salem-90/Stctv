package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import PageObjects.Stctv_Steps;


public class Run_TestOne extends TestBase_Stctv{
	@Test
	public void stctv_Cases() throws Exception{
		
		Stctv_Steps stctv = PageFactory.initElements(driver, Stctv_Steps.class);
		stctv.Search_Assert();
		
	}
}



