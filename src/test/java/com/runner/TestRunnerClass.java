package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.Reporting;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(publish=true,dryRun=false,
monochrome=true,plugin={"pretty","json:target\\index.json"},name="verify adactin login with valid data",features="src\\test\\resources\\Feature\\Login.feature",glue="com.stepdefinition")
public class TestRunnerClass {
@AfterClass
public static void afterClass() {
Reporting.generateJvmReport("C:\\Users\\LogeshKumar\\eclipse-workspace\\CucumberAdactIn\\target\\index.json");	
System.out.println();
}
}
