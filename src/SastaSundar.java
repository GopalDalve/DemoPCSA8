import org.openqa.selenium.chrome.ChromeDriver;

public class SastaSundar 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.sastasundar.com/");

		
	}

}
