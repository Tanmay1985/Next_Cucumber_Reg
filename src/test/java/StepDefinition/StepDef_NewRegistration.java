package StepDefinition;


import ReuseLibrary.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.List;

public class StepDef_NewRegistration {

    @Given("User is on Registration page")

    public void user_is_on_registration_page() throws IOException {

        //Base.driverinitialization();

        Base.registration_p_obj_repo.ClickCookies();
        Base.registration_p_obj_repo.ClickMyAccount();
        Base.registration_p_obj_repo.ClickRegistrationButton();

    }
    @When("User enters following details")
    public void user_enters_following_details(DataTable dataTable) throws InterruptedException {

        List<List<String>> data = dataTable.cells();

        Base.reg_user_details.setTitle(data.get(1).get(1));
        Base.reg_user_details.enterFirstName(data.get(2).get(1));
        Base.reg_user_details.enterLastName(data.get(3).get(1));
        Base.reg_user_details.enterEmail(data.get(4).get(1));
        Base.reg_user_details.enterPass(data.get(5).get(1));
        Base.reg_user_details.ClickShow();
        Base.reg_user_details.enterDOB(data.get(7).get(1));
        Base.reg_user_details.enterPhone(data.get(8).get(1));
        Base.reg_user_details.enterHouseNo(data.get(9).get(1));
        Base.reg_user_details.enterPCode(data.get(10).get(1));
        Base.reg_user_details.ClickFIND();
        Base.reg_user_details.selectAddress();
        Base.reg_user_details.clickPost();
        Base.reg_user_details.ClickTermsAndConditionsLink();
        Base.reg_user_details.ClickPrivacyAndCookiesLink();
        Base.reg_user_details.ClickRegisterNow();

    }
    @Then("User should Register New Account Successfully")
    public void user_should_register_new_account_successfully() {

    }

}
