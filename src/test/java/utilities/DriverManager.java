package utilities;

import java.time.Duration;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	public static WebDriver driver;
	public static ChromeOptions options;

	private DriverManager() {
		
	}

	public static WebDriver driverFactory() {
		if (driver == null) {
			if (ConfigFileReader.launchBrowser().equalsIgnoreCase("Chrome")) {
				WebDriverManager.chromedriver().setup();
				options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(options);
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			}
			if (ConfigFileReader.launchBrowser().equalsIgnoreCase("FireFox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().window().setSize(new Dimension(1920, 1080));
		        
			}
			
			if (ConfigFileReader.launchBrowser().equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
			}
			return driver;
		} else
			return driver;
	}
}
