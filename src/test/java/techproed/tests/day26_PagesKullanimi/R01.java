package techproed.tests.day26_PageKullanimi;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class R01 {

    @Test
    public void test01() throws InterruptedException {

        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim
        Driver.getDriver().get(ConfigReader.getProperty("openSourceUrl"));

        //Username : Admin
        //Password : admin123

        //kullaniciAdi, kullaniciSifre, submitButton elementlerini locate edelim
        OpenSourcePage sourcePage = new OpenSourcePage();
        sourcePage.username.sendKeys(ConfigReader.getProperty("OpenSourceusername"));
        sourcePage.password.sendKeys(ConfigReader.getProperty("OpenSourcepassword"));
        sourcePage.submitbutton.click();


        //Login Testinin basarili oldugunu test et
        Assert.assertTrue(sourcePage.verify.isDisplayed());
        ReusableMethods.bekle(3);


        //sayfayı kapatınız
        Driver.closeDriver();

    }
}
