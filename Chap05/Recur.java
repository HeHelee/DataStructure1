package Chap05;

import java.util.Scanner;

public class Recur {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� :");
		int x = sc.nextInt();
		
		recur(x);
		
	}


	private static void recur(int x) {
		//��� �Լ�
		if (x>0) {
			recur(x-1);
			System.out.println(x);
			recur(x-2);
		}
		
	}

}
