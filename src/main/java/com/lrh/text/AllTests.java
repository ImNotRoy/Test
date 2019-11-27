package com.lrh.text;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.JUnit4TestAdapter;
import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses({ MyAppTest.class })
public class AllTests {
	public static Test suite() {
		TestSuite suite=new TestSuite("All JUnit Test");
		suite.addTest(new JUnit4TestAdapter(App.class));
		return (Test) suite;
	}
}
