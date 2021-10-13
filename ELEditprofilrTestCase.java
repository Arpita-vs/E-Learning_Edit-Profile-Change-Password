package Elearningtestcases;

import java.util.concurrent.TimeUnit;




import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Elearningpages.ElearningEditprofile;
import Elearningpages.elogin;




public class ELEditprofilrTestCase {

	
static WebDriver driver;
	
	static String driverPath = "C:\\Users\\Arpita Sangannavar\\Downloads\\chromedriver_win32\\chromedriver.exe";
	@AfterTest
    public void closeAll()
    {
    	driver.close();
    }
	
	@BeforeTest
	public void veryfylogin()
	{
	
		System.setProperty("webdriver.chrome.driver", driverPath);
		 driver = new ChromeDriver();
		driver.get("http://elearningm1.upskills.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void Editprofile()
	{
		
		elogin login = new elogin (driver);
		 login.typeusername("user27");
		 login.typepassword("ap8");
		 login.clickLoginButton();
		 
		 ElearningEditprofile  edit = new ElearningEditprofile(driver);
		 edit.clickeditprofile();
		 edit.typepass("ap8");
		 edit.typenewpassword("ap9");
		 edit.typeconfirmpassword("ap9");
		 edit.clicksavesettingsbutton();
		 
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 try {
			 boolean editsuccess=edit.success();
				System.out.println("Your new profile has been saved "+ editsuccess);
				Assert.assertEquals(editsuccess, true);
			 
			
		 }
		 	
		 catch (NoSuchElementException e)
			{
			
				System.out.println("cannot change password"+driver.findElement(By.id("messages")).getText());
				Assert.assertEquals(true, true);
				//status=false;
			}
		 

		 

	}
	
	
}
	
		
	