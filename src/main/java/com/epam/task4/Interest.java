package com.epam.task4;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Interest {
	public static void calculateInterest()
	{
		Scanner sc=new Scanner(System.in);
		PrintStream p=new PrintStream(new FileOutputStream(FileDescriptor.out));
		
		p.println("Enter the principle amount :");
		try {
		double princpalamount=sc.nextDouble();
		p.println("Enter the time period :");
		double timeperiod=sc.nextDouble();
		p.println("Enter the rate of interest per annum :");
		double rateofinterest=sc.nextDouble();
		//sc.close();
		p.println("Simple Interest :"+(princpalamount*timeperiod*rateofinterest)/100);
		p.println("Compound Interest :"+((princpalamount*Math.pow(1+(rateofinterest/100),timeperiod))-princpalamount));
		p.println("-------------------------------------");
		}
		catch (Exception e) {
			p.println("Enter a valid input ... ");
			p.println("-------------------------------------");
			
		}
	}
}
