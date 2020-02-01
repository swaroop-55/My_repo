package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;

	public TestBase(){
		try {
		prop=new Properties();
		FileInputStream fis=new FileInputStream("E:\\seleniumhot\\FreeCRMTest\\src\\main\\java\\"
				+ "com\\crm\\qa\\config\\config.properties");
		prop.load(fis);
		}catch(IOException e) {
			e.printStackTrace();
		}	
	}
	
	public static void initialization() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver",
				//	"E:\\seleniumhot\\driver\\Chrome_webdriver\\new_Driver\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "E:\\seleniumhot\\driver\\Chrome_latest\\chromedriver.exe");
			//System.setProperty("webdriver,chrome", arg1)
			driver = new ChromeDriver();
		}
		else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "E:\\seleniumhot\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
















