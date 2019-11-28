package sampledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class next {
WebDriver driver=new FirefoxDriver();

driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm#");

		WebElement aboutus=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a/span"));
		WebElement ouroffice=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"));
		WebElement chennai=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[1]/a/span"));
		
		Actions act=new Actions(driver);
		act.moveToElement(aboutus)


}
