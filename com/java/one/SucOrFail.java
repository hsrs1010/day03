package com.java.one;

import java.util.Scanner;

public class SucOrFail {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//��ü����
		
		System.out.println("���� �Է�>>");
		int score=sc.nextInt();//���� ���ǿ��� �Է� ���� �� ����
		
		if (score>=80) { 
			System.out.println("����� �հ��Դϴ�.");
		}else {
			System.out.println("��Ÿ�����ϴ�.");
		}
		sc.close();//�ڿ�����
		
	}
}
