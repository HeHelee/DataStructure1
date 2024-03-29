package Chap05;

import java.util.Scanner;

import Chap04.IntStack;

public class RecurX2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.: ");
		int x = sc.nextInt();
		
		recur(x);
		

	}
    //재귀를 제거
	private static void recur(int n) {
		IntStack s = new IntStack(n);
		while(true) {
			if (n>0) {
				s.push(n);
				n = n-1;
				continue;
			}
			if (s.isEmpty() != true) {
				n = s.pop();
				System.out.println(n);
				n = n-2;
				continue;
			}
			break;
		}
	}

}
