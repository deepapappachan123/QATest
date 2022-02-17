package stepDefinition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.pageObjects;

import java.io.IOException;

public class stepDefinition extends pageObjects{

    public stepDefinition() throws IOException {

    }
    @Given("User enter list of cloud platforms in google search")
    public void userIsOnGoogle() throws InterruptedException {
        googleSearch();
    }
    @When("User clicks on zdnet link")
    public void user_Clicks_zdnet_link() throws InterruptedException {
        clickZdnetLink();
        Thread.sleep(3000);
    }

    @Then("Verify AWS,Azure,GCP are listed")
    public void verifyAws_Azure_Gcp_InList(){
        verifyAwsAzureGcpInList();
    }

    @And("If AWS present click on Jump to details")
    public void jumpToAWSDetails(){
        jumpToDetails();
    }

    @And("click on view now at amazone")
    public void clickViewNowAtAmazone() throws InterruptedException {
        clickViewAWS();
    }

    @And("it opens up a new tab within the same browser")
    public void verifyNewTabSameBrowser(){
        verifyNewTab();
    }
    @And("^it opens up this URL (.*)$")
    public void verifyURL(String url){
        verifyURLAWS(url);
    }
    @And("^it lands to the page which shows (.*)$")
    public void verifyTitle(String title){
        verifyTitleAWS(title);
        quitBrowser();
    }
}
