package com.java.one;

import java.util.Scanner;

public class IfCalc2 {
	public static void main(String[] args) {
		//�μ��� �Է� �ް�, �����ڵ� �Է� ����
		//�Է� ���� �������� ��� ��� ���
		//if�����
		
		Scanner sc=new Scanner(System.in);
		int num1=0;
		int num2=0;
		
		String oper="";
		
		//�Է� ���� ù��° ����, ������, �ι�° ����
		System.out.println("num1 �Է�");
		num1=sc.nextInt();
		
		System.out.println("������ �Է�(plus,min,mult,div)");
		oper=sc.next();
		
		System.out.println("num2 �Է�");
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
			System.out.println("������ Ȯ��");
		}
	}	
}