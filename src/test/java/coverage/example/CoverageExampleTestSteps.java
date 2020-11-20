package coverage.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Then;

public class CoverageExampleTestSteps {
	
	@Then("I want to check if {string} {string} bissextile")
	public void testIfAnneeBissextile(String year, String isOrIsNot) {
		if ("is".equals(isOrIsNot)) {
			assertTrue(CoverageExample.isBissextile(Integer.parseInt(year)));
		} else if ("is not".equals(isOrIsNot)) {
			assertFalse(CoverageExample.isBissextile(Integer.parseInt(year)));
		}
	}
}
