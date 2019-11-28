package sampledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class sampledemo {
	WebDriver driver;
	String Expectedresult="Find a Flight: MercuryTours:";
@Test
public void Login(){
	driver.findElement(By.name("username")).sendKeys("tutorial");
	driver.findElement(By.name("password")).sendKeys("tutorial");
	driver.findElement(By.name("login")).click();
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebDriverWait wait=new WebDriverWait(driver,30);
	System.out.println(driver.getTitle());
	wait.until(ExpectedConditions.titleIs("Find a Flight: MercuryTours:"));
	Assert.assertEquals(Expectedresult, driver.getTitle());
	
}
}
