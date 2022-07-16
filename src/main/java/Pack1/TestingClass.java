package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Eclipse_Oxygen\\Project1\\src\\main\\java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		String s=driver.getTitle();
		System.out.println(s);
		driver.quit();
	}

}
