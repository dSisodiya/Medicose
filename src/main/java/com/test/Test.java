package com.test;

public class Test {
String s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s=args[0];
		obj();
		//string();
		//table2to10();
			}
public static void obj(){
	Test test1=new Test();
	test1.s="anuj";
	Test test2 =test1;
	test2.s="Sagar";
	
	System.out.println(test1.s);
	System.out.println(test2.s);
	
	
}
	public static void string(){
		String x="Life";
		String y = x;
		System.out.println(y);
		StringBuffer sb=new StringBuffer("Amit");
		System.out.println(sb);
		y="connection";
		System.out.println(x);
		System.out.println(y);
		
	}
	public static void table2to10(){
		
	for (int i = 1; i <= 10; i++) {
		for (int j = 2; j <= 10; j++) {
			int y=i*j;
			System.out.format("%02d",y);
			System.out.print("  ");
			/*if(y<10)
			System.out.print("0"+y+"  ");
			else
				System.out.print(""+y+"  ");*/
		}System.out.println();
	}	
	}
	static public  int getMinValue(){
	int[] arr={1,5,11,-4,77,8,3,-1};
	int x, y,z;
	x=arr[0];
	for(int i=1;i<arr.length;i++)
		{if(x>arr[i])
			x=arr[i];
		}
			System.out.println(x);
 			return x;
}
}
