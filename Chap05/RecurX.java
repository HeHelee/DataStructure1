package Chap05;

import java.util.Scanner;

public class RecurX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		int x = sc.nextInt();
		
		recurX(x);

	}
    //���� ��͸� ����
	private static void recurX(int n) {
		while(n>0) {
			recurX(n-1);
			System.out.println(n);
			n = n-2;
		}
		
		
	}

}
