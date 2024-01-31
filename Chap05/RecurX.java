package Chap05;

import java.util.Scanner;

public class RecurX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int x = sc.nextInt();
		
		recurX(x);

	}
    //꼬리 재귀를 제거
	private static void recurX(int n) {
		while(n>0) {
			recurX(n-1);
			System.out.println(n);
			n = n-2;
		}
		
		
	}

}
