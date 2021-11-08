package com.quad;

import java.util.Scanner;

public class QuadraticProgram {

	public static void main(String[] args) {
		
		 Scanner qd=new Scanner(System.in);
	        double a,b,c;      
	        System.out.println("Enter the value of a..");
	        a=qd.nextDouble();   
	        System.out.println("Enter the value of b..");
	        b=qd.nextDouble();    
	        System.out.println("Enter the value of c..");
	        c=qd.nextDouble();   

	        double d=(b*b)-(4*a*c);   
	        double D= Math.sqrt(d);
	        double r=2*a;
	        
	   
	        if(D>0)
	        {
	            System.out.println("Roots are real and unequal");
	            double root1=(D-b)/r;
	            double root2=(-D-b)/r;
	            System.out.println("Roots are..");
	            System.out.println(root1);
	            System.out.println(root2);
	        }
	        else if(D==0)
	        {
	            System.out.println("The roots of the quadratic equation are real and equal.");
	            double root=(-b)/r;
	            System.out.println("Root is "+root);
	        }
	        else
	        {
	            System.out.println("The roots of the quadratic equation are complex and different");
	            System.out.println("Roots are ");
	            System.out.println((-b/r)+" +i" + D);
	            System.out.println((-b/r)+" -i" + D);
	        }
	}
}
