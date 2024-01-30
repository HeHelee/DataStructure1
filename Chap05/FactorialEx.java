package Chap05;

import java.util.Scanner;

public class FactorialEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();
		
		System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");

	}

	private static int factorial(int x) {
		int fact = 1;
		while(x > 1)
			fact *= x--;
		return fact;
	}

}
