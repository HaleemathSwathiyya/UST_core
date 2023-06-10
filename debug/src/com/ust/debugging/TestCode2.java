
package com.ust.debugging;
import java.math.*;

public class TestCode2 {
	int a;
	int b;
	int x;
	 static int a1[]= {2,5,7,8,5};
	 static int b1[]= {23,43,27,32,12};
	 static int x1[]= {18,19,20,21,22};
	
	static //ax^2 + bx^2 + 2ab;
	
	 int calceqn(int a,int b,int x) {
		int temp;
		int temp1;
		int temp2;
		temp=(int)(a*Math.pow(x, 2));
		temp1=(int)(b*Math.pow(x, 2));
		temp2=2*a*b;
		int esum=(temp+temp1+temp2);
		return esum;
	}
		
		
		
	public static void main(String[] args) {
		int a;
		for(int i=0;i<5;i++) {
			a=calceqn(a1[i],b1[i],x1[i]);
			System.out.println(a);
		}
		// TODO Auto-generated method stub

	}

}
