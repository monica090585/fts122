package google;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,
		monochrome = true,
		features = { "src/test/resources/features/"},
		glue =     { "google/"},
		plugin =   { "pretty",
					 "html:target/simples/resultadoPassos.html",
					 "json:target/simples/resultadoPassos.json",
					 "com.cucumber.listener.ExtentCucumberFormatter:target/dashboard.html"
				}
			
		)
public class Runner {

}
