package Obj_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Reg_User_Details {

    WebDriver driver;

    public Reg_User_Details(WebDriver driver) {
        this.driver = driver;


        PageFactory.initElements(this.driver, this);
    }
    @FindBy(id = "Title")
    WebElement Title;
    @FindBy(id = "FirstName")
    WebElement FirstName;
    @FindBy(id = "LastName")
    WebElement LastName;
    @FindBy(id = "Email")
    WebElement Email;
    @FindBy(id = "Password")
    WebElement Password;
    @FindBy(xpath = "//span[@class='show']")
    WebElement Show;
    @FindBy(id = "DobDate")
    WebElement DateofBirth;
    @FindBy(id = "PhoneNumber")
    WebElement ContactTelephone;
    @FindBy(id = "HouseNumberOrName")
    WebElement HouseNumber;
    @FindBy(id = "Postcode")
    WebElement Postcode;
    @FindBy(id = "SearchPostcode")
    WebElement Find;
    @FindBy(id = "AddressListSelection")
    WebElement SelectAddress;
    @FindBy(id = "ChkByPost")
    WebElement ClickPost;
    @FindBy(id = "linkNextTerms")
    WebElement TermsAndConditions;
    @FindBy(id = "linkNextCookie")
    WebElement PrivacyAndCookiePolicy;
    @FindBy(id = "SignupButton")
    WebElement RegisterMyAccount;

    public void setTitle(String TitleValue){
        Select obj1 = new Select(Title);
        obj1.selectByValue(TitleValue);

    }

    public void enterFirstName(String Fname){FirstName.sendKeys(Fname);}
    public void enterLastName(String Lname){LastName.sendKeys(Lname);}
    public void enterEmail(String EMAIL){Email.sendKeys(EMAIL);}
    public void enterPass(String Pass){Password.sendKeys(Pass);}
    public void ClickShow(){Show.click();}
    public void enterDOB(String DOB){DateofBirth.sendKeys(DOB);}
    public void enterPhone(String Phone){ContactTelephone.sendKeys(Phone);}
    public void enterHouseNo(String HouseNo){HouseNumber.sendKeys(HouseNo);}
    public void enterPCode(String PCode){Postcode.sendKeys(PCode);}
    public void ClickFIND(){Find.click();}

    public void selectAddress() throws InterruptedException {
        Thread.sleep(2000);
        Select obj = new Select(SelectAddress);
    }
    public void clickPost(){ClickPost.click();}
    public void ClickTermsAndConditionsLink(){TermsAndConditions.click();}
    public void ClickPrivacyAndCookiesLink(){PrivacyAndCookiePolicy.click();}
    public void ClickRegisterNow(){RegisterMyAccount.click();}


}
