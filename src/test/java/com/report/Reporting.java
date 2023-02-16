package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
public static  void generateJvmReport(String jsonFile){
// 1 Mention the path of Jvmreport
	File file=new File("C:\\Users\\LogeshKumar\\eclipse-workspace\\CucumberAdactIn\\target");
	//2 create the object for configuration class
	Configuration configuration=new Configuration(file, "CucumberAdactin");
	//3 key and value browser version sprints os
	configuration.addClassifications("Broser","chrome");
	configuration.addClassifications("Version", "108");
	configuration.addClassifications("Os", "WIN11");
	configuration.addClassifications("sprint", "34");
	// create the object for report builders
	List<String>jsonFiles=new ArrayList<String>();
	jsonFiles.add(jsonFile);
	ReportBuilder builder=new ReportBuilder(jsonFiles, configuration);
	// create jvm report
	builder.generateReports();
}
}
