package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.Hw_Ahmet_hoca;
import utilities.Driver;

public class hw_ahmethoca {

    Hw_Ahmet_hoca hw = new Hw_Ahmet_hoca();



    @Given("kullanıcı {string} gider")
    public void kullanıcı_gider(String string) {
        Driver.getDriver().get(string);

    }
    @When("kullanici login sayfasina gider")
    public void kullanici_login_sayfasina_gider() {
        hw.loginbutton.click();


    }
    @When("kullanıcı kullanıcı adını {string} girer")
    public void kullanıcı_kullanıcı_adını_girer(String string) {
        hw.email.sendKeys(string);


    }
    @When("kullanıcı şifreyi {string} girer")
    public void kullanıcı_şifreyi_girer(String string) {
        hw.password.sendKeys(string);


    }
    @When("login butonuna basar")
    public void login_butonuna_basar() {


    }
    @Then("login islemi gerçekleşir")
    public void login_islemi_gerçekleşir() {

    }



}
