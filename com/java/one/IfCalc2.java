package com.java.one;

import java.util.Scanner;

public class IfCalc2 {
	public static void main(String[] args) {
		//두수를 입력 받고, 연산자도 입력 받음
		//입력 받은 내용으로 계산 결과 출력
		//if문사용
		
		Scanner sc=new Scanner(System.in);
		int num1=0;
		int num2=0;
		
		String oper="";
		
		//입력 순서 첫번째 숫자, 연산자, 두번째 숫자
		System.out.println("num1 입력");
		num1=sc.nextInt();
		
		System.out.println("연산자 입력(plus,min,mult,div)");
		oper=sc.next();
		
		System.out.println("num2 입력");
		num2=sc.nextInt();
		
		if (oper.equals("plus")) {
			System.out.println("plus : "+(num1+num2));
		}
		else if (oper.equals("mun")) {
			System.out.println("min : "+(num1-num2));
		}
		else if (oper.equals("mult")) {
			System.out.println("mult : "+(num1*num2));
		}	
		else if (oper.equals("div")) {
			System.out.println("div : "+(num1/num2));
		}
		else { 
			System.out.println("연산자 확인");
		}
	}	
}