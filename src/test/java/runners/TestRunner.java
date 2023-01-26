package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

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
        tags = "@data_table_test",// hangi feature file kosmali onu belirtiyoruz= > Eger tags kullanmaz isek Runner tum feature run eder
        dryRun = false
)

public class TestRunner {
}
