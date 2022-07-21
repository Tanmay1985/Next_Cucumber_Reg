package Obj_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_P_Obj_Repo {

    WebDriver driver;

    public Registration_P_Obj_Repo(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//*[@id=\"onetrust-close-btn-container\"]/button")
    WebElement Cookies;
    @FindBy(xpath = "//a[@title='Sign in to view account details']")
    WebElement MyAccount;
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[4]/div[1]/a[1]/span[1]")
    WebElement RegistrationButton;

    public void ClickCookies(){
        Cookies.click();
    }
    public void ClickMyAccount(){
        MyAccount.click();
    }
    public void ClickRegistrationButton(){
        RegistrationButton.click();
    }


}
