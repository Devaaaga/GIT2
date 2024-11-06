package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void generateJvmReport(String jsonpath) {
		//1.Mention The target folder location - File
		File f = new File("C:\\Users\\devaa\\eclipse-workspace\\Google\\Reports\\JVM Report");
		//2.Add Details to the report using Configuration class
		Configuration c = new Configuration(f,"Facebook Application");
		c.addClassifications("employee name","Devaagar");
		c.addClassifications("Employee Id","2345");
		//3.Add json file paths into List<String>
		List<String>l = new ArrayList<String>();
		l.add(jsonpath);
		//4.Create object for ReportBuilder class
		ReportBuilder r = new ReportBuilder(l,c);
		r.generateReports();
		
	}

	
		
	}


