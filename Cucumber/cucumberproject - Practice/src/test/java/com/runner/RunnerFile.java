package com.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions(features="src/test/resources/features", 
dryRun=!true,
glue="stepdefinitions",
snippets = SnippetType.CAMELCASE,
plugin = {"pretty",
		"summary",
		"json:target/JSONReports/report.json",
		"junit:target/JUnitReports/report.xml",
		"html:target/HTMLReports/report.html"
		
},
tags = "@Smoke or @Sanity"
		)
public class RunnerFile extends AbstractTestNGCucumberTests {

}
