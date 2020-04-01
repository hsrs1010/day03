package com.java.one;

import java.util.Scanner;

public class SucOrFail {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//객체생성
		
		System.out.println("점수 입력>>");
		int score=sc.nextInt();//값을 자판에서 입력 받을 수 있음
		
		if (score>=80) { 
			System.out.println("당신은 합격입니다.");
		}else {
			System.out.println("안타깝습니다.");
		}
		sc.close();//자원해제
		
	}
}
