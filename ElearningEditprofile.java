package Elearningpages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class ElearningEditprofile {
	WebDriver driver;	

	
	By editprofile=By.xpath("//*[@id=\"profileCollapse\"]/div/ul/li[5]/a");
	By pass=By.id("profile_password0");
	By newpassword =By.id("password1");
	By confirmpassword=By.id("profile_password2");
    By savesettingsbutton=By.id("profile_apply_change");
	By editsuccess=By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/div[1]");

	//creating parameterized constructor to initialize WebDriver reference
	public ElearningEditprofile(WebDriver driver)
	{
		this.driver =driver;
	}
	
	public void clickeditprofile()
	{
		driver.findElement(editprofile).click();
	}
	public void typepass(String p0)
	{
		driver.findElement(pass).sendKeys(p0);
	}
	public void typenewpassword(String p1)
	{
		driver.findElement(newpassword).sendKeys(p1);
	}
	public void typeconfirmpassword(String p2) {
		driver.findElement(confirmpassword).sendKeys(p2);
	}
	
	public void clicksavesettingsbutton()
	{
		driver.findElement(savesettingsbutton).click();
		
	}
	public boolean success() 
	{
	boolean success=driver.findElement(editsuccess).isDisplayed();
	return success;
	}

	
	

	

}
