package IP;

import java.util.ArrayList;
import java.util.List;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ITestResult;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;



public class Reporter implements IReporter {

	@Override
	public void generateReport(List<XmlSuite> XmlSuites, List<ISuite> suites,
			String Output) {
		// TODO Auto-generated method stub
		for(ISuite suite: suites)
		{
			String suitesname = suite.getName();
			System.out.print(suitesname);
		}
		
	}
	
	public void SetupXml()
	{
		XmlSuite suite = new XmlSuite();
		suite.setName("TmpSuite");
		
		XmlTest test = new XmlTest(suite);
		List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass("IP.TestIP"));
		test.setXmlClasses(classes);
		
		TestNG tng = new TestNG();
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		tng.setXmlSuites(suites);
		tng.run();
	}
	public static void main(String[] args)
	{
		Reporter a = new Reporter();
		a.SetupXml();
		a.generateReport(XmlSuites, suites, null);
//		XmlSuite suite = new XmlSuite();
//		suite.setName("TmpSuite");
//		
//		XmlTest test = new XmlTest(suite);
//		List<XmlClass> classes = new ArrayList<XmlClass>();
//		classes.add(new XmlClass("IP.TestIP"));
//		test.setXmlClasses(classes);
//		
//		
//		TestNG tng = new TestNG();
//		List<XmlSuite> suites = new ArrayList<XmlSuite>();
//		suites.add(suite);
//		tng.setXmlSuites(suites);
//		tng.run();

	}

}
