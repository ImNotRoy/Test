package com.lrh.text;
import org.apache.commons.math3.stat.descriptive.rank.Max;
import org.apache.commons.math3.stat.descriptive.rank.Min;

import java.util.Scanner;

import org.apache.commons.math3.stat.descriptive.moment.Mean; 

public class App 
{

	public static void main( String[] args )
    {
    	App myTest= new App();
    	myTest.GetResult();
    }

    public void GetResult() {
    	Scanner in = new Scanner(System.in);
    	double[] a=new double[10];
    	for(int i=0;i<a.length;i++)
    		a[i]=in.nextInt();
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
        for(double i:a)
        System.out.println(i);
	}
}