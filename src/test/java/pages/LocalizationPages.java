package pages;

import driver.ThreadLocalDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;
import utils.WaitUtils;

public class LocalizationPages extends BasePage{
    public LocalizationPages(ThreadLocalDriver driver){
        super(driver);
    }

    public static WaitUtils wait = new WaitUtils();

    @AndroidFindBy(id = "on_board_title")
    AndroidElement onBoardingTitle;
    @AndroidFindBy(id = "on_board_description")
    AndroidElement onBoardingDesc;
    @AndroidFindBy(id = "input_country")
    AndroidElement fieldCuntry;
    @AndroidFindBy(id = "input_language")
    AndroidElement fieldLanguage;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Your Preferred Country']")
    AndroidElement tryTitle;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Indonesia']")
    AndroidElement chooseIndonesia;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Your Preferred Language']")
    AndroidElement tryTitle2;
    @AndroidFindBy(xpath = "//android.widget.Button[@text = 'Lanjutkan']")
    AndroidElement nextButton;
    @AndroidFindBy(id = "buttonJoin")
    AndroidElement joinBtn;
    @AndroidFindBy(id = "button_tooltip")
    AndroidElement toolTip;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Tiket Pesawat']")
    AndroidElement flightTicket;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Pesawat']")
    AndroidElement flightText;
    @AndroidFindBy(id = "text_field_origin")
    AndroidElement fieldFromDest;
    @AndroidFindBy(id = "edit_text_field")
    AndroidElement fieldSearchCity;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Jakarta, Indonesia']")
    AndroidElement cityJakarta;
    @AndroidFindBy(id = "text_field_destination")
    AndroidElement fieldToDest;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Padang, Indonesia']")
    AndroidElement cityPadang;
    @AndroidFindBy(id = "btn_search")
    AndroidElement btnSearchFlight;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Jakarta (JKTA) Padang (PDG)']")
    AndroidElement titleFlight;

    public void onScreenChooseCountryLanguage(){
        Assert.assertEquals(onBoardingTitle.getText(), "Halo! Selamat datang di Traveloka.");
        Assert.assertEquals(onBoardingDesc.getText(), "To continue, pick your country and language.");
    }

    public void chooseCountry(){
        fieldCuntry.click();
        wait.waitForElementToBeVisibleAndroid(tryTitle, ThreadLocalDriver.getTLDriver(), 500);
        chooseIndonesia.click();
    }

    public void chooseLanguage(){
        fieldLanguage.click();
        wait.waitForElementToBeVisibleAndroid(tryTitle2, ThreadLocalDriver.getTLDriver(), 500);
        chooseIndonesia.click();
    }

    public void clickButtonNext(){
        nextButton.click();
    }

    public void clickJointButton(){
        joinBtn.click();
    }

    public void userClickBack(){
        ThreadLocalDriver.getTLDriver().pressKey(new KeyEvent(AndroidKey.BACK));
        toolTip.click();
    }

    public void onScreenHome(){
        Assert.assertTrue(flightTicket.isDisplayed());
    }
    public void userClickFlight(){
        flightTicket.click();
        wait.waitForElementToBeVisibleAndroid(flightText, ThreadLocalDriver.getTLDriver(), 500);
    }
    public void userChooseFromDest(String city){
        fieldFromDest.click();
        fieldSearchCity.sendKeys(city);
        cityJakarta.click();
    }
    public void userChooseToDest(String city2){
        fieldToDest.click();
        fieldSearchCity.sendKeys(city2);
        cityPadang.click();
    }
    public void userClickBtnSearch(){
        btnSearchFlight.click();
        wait.waitForElementToBeVisibleAndroid(toolTip, ThreadLocalDriver.getTLDriver(), 500);
        toolTip.click();
        Assert.assertTrue(titleFlight.isDisplayed());
    }
}
