import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		System.setProperty("webdriver.com.driver","C:\\Users\\aditi verma\\Documents\\chromedriver-win64.exe");// manually with .exe file
		// invoke chrome browser
		WebDriver driver=new ChromeDriver();
		
		//hit URL of browser- URL must be in quotes for string
		driver.get("https://www.wikipedia.org/");
		System.out.println(driver.getTitle()); //to get title of website
		System.out.println(driver.getCurrentUrl());// to get and print URL of website
		driver.close();

	}

}
