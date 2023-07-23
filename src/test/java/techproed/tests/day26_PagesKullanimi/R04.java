package techproed.tests.day26_PageKullanimi;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class R04 {
    @Test
    public void test01() {
        //Acceptance Criteria:
        //Admin olarak, uygulamaya giriş yapabilmeliyim
        //https://www.bluerentalcars.com/
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));


        //Admin email: jack@gmail.com -->.properties dosyasında
        //Admin password: 12345 -->.properties dosyasında


        //Giriş yapıldığını doğrulayalım


        //Sayfayı kapatınız

    }
}
