package com.retryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
	@Test(retryAnalyzer = com.retryAnalyzer.RetryAnalyzer.class)
	
	    public void testPass() {
	        System.out.println("Running testPass...");
	        Assert.assertTrue(true);
	    }

}
