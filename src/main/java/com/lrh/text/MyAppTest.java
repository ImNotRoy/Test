package com.lrh.text;
import org.apache.commons.math3.stat.descriptive.rank.Max;
import org.apache.commons.math3.stat.descriptive.rank.Min; 
import org.apache.commons.math3.stat.descriptive.moment.Mean; 
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("restriction")
public class MyAppTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
    @Test
	public void testMin() {
		double[] a={1,2,3,4,5,6,7,8,9,10};
    	Min min=new Min();
        double mi=min.evaluate(a);
        assertEquals(1,mi,0);
	}

	@Test
	public void testMax() {
		double[] a={1,2,3,4,5,6,7,8,9,10};
		Max max=new Max();
        double ma=max.evaluate(a);
        assertEquals(10,ma,0);
	}
	@Test
	public void testMean() {
		double[] a={1,2,3,4,5,6,7,8,9,10};
		Mean mean = new Mean();
        double me=mean.evaluate(a);
        assertEquals(5.5,me,0);

}
	@Test
	public void testGetSult() {
		double[] a={1,2,3,4,5,6,7,8,9,10};
		double[] b= {11.0,12.0,13.0,14.0,15.0,5.0,6.0,7.0,8.0,9.0};
    	Max max=new Max();
    	Min min=new Min();
        double ma=max.evaluate(a);
        double mi=min.evaluate(a);
        Mean mean = new Mean();
        double me=mean.evaluate(a);
        int j=0;
        while(j<10)
        {
        if(a[j]<me)
        {
        	a[j]+=ma;
        }
        else if(a[j]>me)
        {
        	a[j]-=mi;
        }
        j++;
        }
        int k=0;
        for(double i:a) {
        	assertEquals(b[k],i,0);
        	k++;
        }
	}
}
