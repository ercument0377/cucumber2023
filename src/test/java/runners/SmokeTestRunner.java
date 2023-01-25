package runners;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        features = "src/test/resources", // ZORUNLU  => Feature dosyanin pathini girmemiz laim
        glue = "stepdefinitions", //ZORUNLU => Stepdefinition adresi ('path)'i
        tags = "@smoke",// hangi feature file kosmali onu belirtiyoruz= > Eger tags kullanmaz isek Runner tum feature run eder
        dryRun = false
)
public class SmokeTestRunner {

}
