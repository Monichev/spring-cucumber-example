package com.manoj.training.app;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/bag.feature", plugin = {"pretty", "html:target/cucumber.html"})
public class BagCucumberIntegrationTest {

}
