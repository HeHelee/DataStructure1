package Chap05;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���");
		int x = sc.nextInt();
		
		System.out.println(x + "�� ���丮���� " + factorial(x)+ "�Դϴ�.");

	}

	 static int factorial(int x) {
		//���� �ƴ� ���� n�� ���丮���� ��ȯ
		if (x>0)
			return x * factorial(x-1);
		else
			return 1;
	}

}
