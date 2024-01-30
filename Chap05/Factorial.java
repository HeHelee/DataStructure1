package Chap05;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요");
		int x = sc.nextInt();
		
		System.out.println(x + "의 팩토리얼은 " + factorial(x)+ "입니다.");

	}

	 static int factorial(int x) {
		//음이 아닌 정수 n의 팩토리얼값을 반환
		if (x>0)
			return x * factorial(x-1);
		else
			return 1;
	}

}
