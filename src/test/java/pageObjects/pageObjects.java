package pageObjects;

//import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resources.base;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class pageObjects extends base{
    WebDriver driver = initializedriver();
    @FindBy(xpath = "//input[@title='Search']")
    WebElement googleSearch;
    @FindBy(xpath = "(//*[@id='rso']//a[@href='https://www.zdnet.com/article/the-top-cloud-providers-of-2021-aws-microsoft-azure-google-cloud-hybrid-saas/'])[2]")
    WebElement zdnetlink;
    @FindBy(xpath="//*[@id='onetrust-accept-btn-handler']")
    WebElement accpetAll;
    @FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//*[@value='Google Search']")
    WebElement search;
    @FindBy(xpath = "//*[@class='listicle-precap']//div[@class='precap-hed']")
    List<WebElement> platform;
    @FindBy(xpath = "//*[@class='listicle-precap']//div[@class='precap-hed']//parent::div//a[@data-component='jumpTo']")
    WebElement jumpToDetails;
    @FindBy(xpath = "//div[@class='listicle-links']//a[@href='https://aws.amazon.com/what-is-aws/']")
    WebElement viewNowAWS;
    @FindBy(xpath = "//div[@class='lb-col lb-tiny-24 lb-mid-13']//h1[@id='Cloud_computing_with_AWS']")
    WebElement titlwAWS;

   private static Logger Log = Logger.getLogger(pageObjects.class.getName());
    public pageObjects() throws IOException {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void googleSearch() throws InterruptedException {
        driver.manage().window().maximize();
        googleSearch.sendKeys("list of cloud platforms");
        search.click();
        Thread.sleep(2000);
    }
    public void clickZdnetLink() throws InterruptedException {
        zdnetlink.click();
        Thread.sleep(3000);
        accpetAll.click();
    }
    public void verifyAwsAzureGcpInList(){
        ArrayList<String> platformList = new ArrayList<>();
        platformList.add("Amazon Web Services");
        platformList.add("Google Cloud Platform");
        platformList.add("Microsoft Azure");

        ArrayList<String> platformListUI = new ArrayList<>();
        for ( WebElement value:platform
        ) {
            String text = value.getText();
            platformListUI.add(text);
        }

        int count = 0;
        for (int i = 0; i < platformList.size(); i++) {
            for (int j = 0; j < platformListUI.size(); j++) {
                if (platformListUI.contains(platformList.get(i))) {
                    count++;
                    break;
                }
            }
        }

        if(count==platformList.size()){
            Log.info("AWS,GCP and Azure present in the list");
        }else
            Assert.fail("Not present in the list");
    }

    public void jumpToDetails(){
        for ( WebElement value:platform
        ) {
            String text = value.getText();
            if(text.equals("Amazon Web Services"))
                jumpToDetails.click();
        }
    }

    public void clickViewAWS() throws InterruptedException {
        viewNowAWS.click();
        Thread.sleep(3000);
    }

    public void verifyNewTab(){
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        if(newTab.size()==2)
            Log.info("New Tab is opened in same browser");
        else
            Assert.fail("New Tab is not opened in same browser");
    }

    public void verifyURLAWS(String url){
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        Assert.assertEquals(url,driver.getCurrentUrl());
    }

    public void verifyTitleAWS(String title){
        String titleUI = titlwAWS.getText();
        Assert.assertEquals(title,titleUI);
    }

    public void quitBrowser(){
        driver.quit();
    }
}
