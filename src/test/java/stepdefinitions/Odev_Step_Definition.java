package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.OdevDataTablesPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Odev_Step_Definition {

    OdevDataTablesPage odevDatatabesPage =new OdevDataTablesPage();

    @Given("kullanici new button’a Click eder")
    public void kullanici_new_button_a_click_eder() {
        Driver.getDriver().get(ConfigReader.getProperty("odev_url_new"));
        odevDatatabesPage.addDataTablesNev.click();

    }
    @When("kullanıcı tüm fields girer")
    public void kullanıcı_tüm_fields_girer() throws InterruptedException {
        odevDatatabesPage.firsName.sendKeys("Ercument");
        odevDatatabesPage.lastName.sendKeys("Ercu");
        odevDatatabesPage.position.sendKeys("manager");
        odevDatatabesPage.office.sendKeys("ABD");
        odevDatatabesPage.extension.sendKeys("444");
        Thread.sleep(3000);
        odevDatatabesPage.startDate.sendKeys("2023-02-22");
        odevDatatabesPage.salary.sendKeys("400");
        Thread.sleep(1000);
    }
    @When("kullanıcı create buttona click eder")
    public void kullanıcı_create_buttona_click_eder() throws InterruptedException {
        odevDatatabesPage.create.click();

    }
    @When("kullanıcı first name arar")
    public void kullanıcı_first_name_arar() {
        odevDatatabesPage.search.sendKeys("Ercument Ercu");
    }
    @Then("name fields’in first name içerdiğini verify eder")
    public void name_fields_in_first_name_içerdiğini_verify_eder() throws InterruptedException {
        Thread.sleep(2000);
        //   odevDatatabesPage.salihDemir.getText();
        Assert.assertEquals("Ercument Ercu",odevDatatabesPage.ercumentErcu.getText());
    }

}