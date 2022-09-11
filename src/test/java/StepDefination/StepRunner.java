package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Stepfeature\\A.feature",glue= {"StepDefination"},plugin= {"pretty","html:target\\LogRunner\\html.report"})
public class StepRunner {

}
