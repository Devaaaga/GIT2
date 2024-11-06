package org.demo;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.JvmReport;

import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\devaa\\eclipse-workspace\\Google\\src\\test\\resources\\feature\\",
glue="org.step",dryRun = false,plugin = {"pretty","json:C:\\Users\\devaa\\eclipse-workspace\\Google\\Reports\\json Report\\fb.json"})

public class Runner {
	@AfterClass
	public static void report() {
		JvmReport.generateJvmReport("C:\\Users\\devaa\\eclipse-workspace\\Google\\Reports\\json Report\\fb.json");
	}
	

}
