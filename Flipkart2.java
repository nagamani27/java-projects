import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart2 {

	public static void main(String[] args) throws InterruptedException 
	{
		 select("Electronics","Mobiles");
	}
		    public static void select(String Header,String SubHeader) throws InterruptedException
		    {
		    	int requiredIndex=0;
		    	int requiredLine=0;
		   
		    	System.setProperty("webdriver.chrome.driver","C:\\Users\\RC\\eclipse-workspace\\Sai5\\driver\\chromedriver.exe");
		    	
		    	WebDriver driver=new ChromeDriver();
		    	driver.navigate().to("https://www.flipkart.com/");
		    	List<WebElement> ParentElement= driver.findElements(By.xpath("//div[@class='_3Ed3Ub']/ul/li/a"));
		    	System.out.println(ParentElement.size());
		    
		    	for(int i=0;i<ParentElement.size();i++)
		    	{
		    		System.out.println(ParentElement.get(i).getText());
		    		if(ParentElement.get(i).getText().equals(Header))
		    		{
		    			requiredLine=i;
		    			break;
		    		}
		    	}
		    	Thread.sleep(5000);
		    	ParentElement.get(requiredLine).click();
		    	
		    	
		    	List <WebElement> HeadElement=driver.findElements(By.xpath("//ul[@class='_3GtRpC']/li/ul"));
		        List<WebElement> SubElement=HeadElement.get(requiredLine).findElements(By.tagName("span"));
		        for(int i=0;i<SubElement.size();i++)
		        {
		        	if(SubElement.get(i).getText().equals(SubHeader))
		        	{
		        		requiredIndex=i;
		        		break;
		        	}
		        
		        }
		    	
		        SubElement.get(requiredIndex).click();
		    	
		    	
		    	
		    	
		    	
		    	
		    }
		    
}	    