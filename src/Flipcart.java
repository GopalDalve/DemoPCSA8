import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
}