package step_definitions_Miltilingual;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import multiligual_pages.ChangePasswordPage;
import multiligual_pages.HomePage;
import multiligual_pages.MyAccountPage;
import multiligual_pages.OrderPage;
import multiligual_pages.SignUpPage;
import multilingual_User.User;


public class All_Steps_Need {
	
      WebDriver driver;
      User Manir;
      HomePage homepage;
      SignUpPage signuppage;
      MyAccountPage myaccountpage;
      OrderPage orderpage;
      ChangePasswordPage changepwdpage;
	 
	 public WebDriver getDriver() {
		 if(driver==null) {
			 WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 }
		return driver;
	}
	public User getManir() {
		if(Manir==null) {
			Manir=new User();
		}
		return Manir;
	}
	public HomePage getHomepage() {
		if(homepage==null) {
			homepage=new HomePage(getDriver());
		}
		return homepage;
	}
	public SignUpPage getSignuppage() {
		if(signuppage==null) {
			signuppage=new SignUpPage(getDriver());
		}
		return signuppage;
	}
	public MyAccountPage getMyaccountpage() {
		if(myaccountpage==null) {
			myaccountpage=new MyAccountPage(getDriver());
		}
		return myaccountpage;
	}
	public OrderPage getOrderpage() {
		if(orderpage==null) {
			orderpage=new OrderPage(getDriver());
		}
		return orderpage;
	}
	public ChangePasswordPage getChangePasswordPage() {
		if(changepwdpage==null) {
			changepwdpage=new ChangePasswordPage(getDriver());
		}return changepwdpage;
	}
	}

