package com.java.one;

import java.util.Scanner;

public class IfCalc3 {
	public static void main(String[] args) {
		//�μ��� �Է� �ް�, �����ڵ� �Է� ����
		//�Է� ���� �������� ��� ��� ���
		//if�����
		
		Scanner sc=new Scanner(System.in);
		float num1=0;
		float num2=0;
		
		String oper="";
		
		//�Է� ���� ù��° ����, ������, �ι�° ����
		System.out.println("num1 �Է�");
		num1=sc.nextInt();
		
		System.out.println("������ �Է�(+,-,*,/)");
		oper=sc.next();
		
		System.out.println("num2 �Է�");
		num2=sc.nextInt();
		
		if (oper.equals("+")) {
			System.out.println("+ : "+(num1+num2));
		}
		else if (oper.equals("-")) {
			System.out.println("- : "+(num1-num2));
		}
		else if (oper.equals("*")) {
			System.out.println("* : "+(num1*num2));
		}	
		else if (oper.equals("/")) {
			System.out.printf("/ : "+(float)(num1/num2));
	
		}
		else { 
			System.out.println("������ Ȯ��");
			
		}
	}	
}