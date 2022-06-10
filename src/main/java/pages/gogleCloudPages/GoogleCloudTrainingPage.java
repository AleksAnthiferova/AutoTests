package pages.gogleCloudPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class GoogleCloudTrainingPage extends BasePage {

    public GoogleCloudTrainingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[starts-with(@class,'cloud-button')][contains(text(),'See learning paths')]")
    private WebElement learningPathBtn;
    @FindBy(xpath = "//a[starts-with(@href,'/training/app')]")
    private WebElement applicationDevelopment;

    public GoogleCloudTrainingPage learningPathBtnClick() {
        learningPathBtn.click();
        return new GoogleCloudTrainingPage(webDriver);
    }

    public GoogleCLoudAppDevPage appDevChoose() {
        applicationDevelopment.click();
        return new GoogleCLoudAppDevPage(webDriver);
    }


}
