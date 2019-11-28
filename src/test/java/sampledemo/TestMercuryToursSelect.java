package sampledemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;



public class TestMercuryToursSelect {
public static void main(String args[])
{
	
		System.setProperty("webdriver.chrome.driver", "C:\\\\REST Webservice\\\\Selenium 3.0\\\\Selenium 3.0\\\\Selium 3.0\\\\Selium 3.0\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select")).sendKeys("4");
	WebElement from=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select"));
  Select sel=new Select(from);
  sel.selectByIndex(1);
//	List<WebElement> list=sel.getOptions();
//	for(WebElement e:list)
//	{
//		String city=e.getText();
//		if(city.equals("Paris"))
//		{
//			Assert.assertEquals(city, "Paris");
//			sel.selectByValue(city);
//			break;
//		}
//	}
//	
 }
}
