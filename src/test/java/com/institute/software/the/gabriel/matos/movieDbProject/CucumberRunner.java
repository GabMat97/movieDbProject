package com.institute.software.the.gabriel.matos.movieDbProject;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber"},
        features={"src/test/resources/feature"}
)
public class CucumberRunner {

}


