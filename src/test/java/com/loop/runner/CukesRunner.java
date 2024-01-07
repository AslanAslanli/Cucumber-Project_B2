package com.loop.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = {"html:target/html-reports/cucumber-report.html",
                  "json:target/json-reports/json-report.json"},
        features = "src/test/resources/features",
        glue = "com/loop/step_definitions",
        dryRun = false, // true dryRun checks snippet coverage for each scenario steps. dryRun false checks it AND everything inside the steps i.e. function bodies
        tags = "@smoke",
        monochrome = true // this removes redundant logs in the run terminal
)

public class CukesRunner {

}
