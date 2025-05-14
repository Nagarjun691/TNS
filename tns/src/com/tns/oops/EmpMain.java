package com.tns.oops;

public class EmpMain {
	public static void main(String args[]) {
		employee ob=new employee();
		ob.setEid(101);
		int num=ob.getEid();
		System.out.println(num);
		
		ob.setEname("ram");
		String a=ob.getEname();
		System.out.println(a);
		
		ob.setSal(10000.2f);
		float c=ob.getSal();
		System.out.println(c);
		
	}

}
