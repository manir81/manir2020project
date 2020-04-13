package multiligual_pages;

import org.openqa.selenium.WebDriver;

public class ChangePasswordPage extends CommonPage{
    String oldPassword_label="{xpath://*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[1]/input";
	String Paswrd_Label= "{xpath://*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[4]/div/input[2]";
	String newPassword_label="{xpath://*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[2]/input";
	String CfnPassword_label="{xpath://*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[3]/input";
	public ChangePasswordPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	public void changePasswordBy() {
		// TODO Auto-generated method stub
//		uglyWaitFor(6000);
		 typeOperation(getWebElementByOperation(oldPassword_label),"pass");
//		 uglyWaitFor(6000);
		 typeOperation(getWebElementByOperation(newPassword_label),"pass");
//		 uglyWaitFor(6000);
		 typeOperation(getWebElementByOperation(CfnPassword_label),"pass");
//		 uglyWaitFor(6000);
	 clickOperation(getWebElementByOperation(Paswrd_Label));
		
	}

	

	

}
