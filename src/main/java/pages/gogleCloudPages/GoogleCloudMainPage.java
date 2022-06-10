package pages.gogleCloudPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class GoogleCloudMainPage extends BasePage {

    public GoogleCloudMainPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement searchBtn;
    @FindBy(xpath = "//a[@track-name='solutions'][contains(text(),'Solutions')]")
    private WebElement solutionsBtn;
    @FindBy(xpath = "//a[starts-with(@track-metadata-module,'secondary')][contains(text(),'Industry Solutions')]")
    private WebElement dropDownMenuIndustrySolutionsTab;
    @FindBy(xpath = "//div[@class='devsite-nav-item-title'][contains(text(),'Gaming')]")
    private WebElement gamingBtn;
    @FindBy(xpath = "//a[@track-name='talk to us']")
    private WebElement talkToUsBtn;
    @FindBy(xpath = "//div[@class='t-cloud-inner']")
    private WebElement checkScroll;
    @FindBy(xpath = "//a[starts-with(@class,'gc-analytics-event')][contains(text(),'Getting started')]")
    private WebElement gettingStartTab;
    @FindBy(xpath = "//div[starts-with(@class,'devsite-nav-item-title')][contains(text(),'Training')]")
    private WebElement trainingBtn;


    public SearchResultGoogleCloudPage inputInSearchField(String txt) {
        searchBtn.click();
        searchBtn.sendKeys(txt);
        searchBtn.sendKeys(Keys.ENTER);
        return new SearchResultGoogleCloudPage(webDriver);
    }

    public GoogleCloudMainPage solutionsBtnClick() {
        solutionsBtn.click();
        return new GoogleCloudMainPage(webDriver);
    }

    public GoogleCloudMainPage industrySolutionsChoose() {
        dropDownMenuIndustrySolutionsTab.click();
        return new GoogleCloudMainPage(webDriver);
    }

    public GoogleCloudGamingPage gamingBtnClick() {
        gamingBtn.click();
        return new GoogleCloudGamingPage(webDriver);
    }

    public GoogleCloudContactPage talkToUsBtnClick() {
        scrollBy(checkScroll);
        talkToUsBtn.click();
        return new GoogleCloudContactPage(webDriver);
    }

    public GoogleCloudMainPage gettingStartTabClick() {
        gettingStartTab.click();
        return new GoogleCloudMainPage(webDriver);
    }

    public GoogleCloudTrainingPage chooseTraining(){
        trainingBtn.click();
        return  new GoogleCloudTrainingPage(webDriver);
    }

}
