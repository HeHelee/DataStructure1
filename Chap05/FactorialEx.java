package Chap05;

import java.util.Scanner;

public class FactorialEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int x = sc.nextInt();
		
		System.out.println(x + "�� ���丮���� " + factorial(x) + "�Դϴ�.");

	}

	private static int factorial(int x) {
		int fact = 1;
		while(x > 1)
			fact *= x--;
		return fact;
	}

}
