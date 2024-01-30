package Chap05;

import java.util.Scanner;

public class GCDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 개 정수의 최대 공약수를 구할까요?: ");
		int num;
		do {
			num = sc.nextInt();
		}while(num<=1);
		
		int[] x = new int[num]; //길이가 num인 배열
		
		for(int i = 0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.println("최대 공약수는 " + gcdArray(x,0,num) + "입니다.");
	}

	static int gcdArray(int[] x, int start, int no) {
		if (no == 1)
			return x[start];
		else if (no == 2)
			return gcd(x[start],x[start+1]);
		else
			return gcd(x[start],gcdArray(x,start+1,no-1));
	}

	private static int gcd(int x, int y) {
		while (y != 0) {
			int temp = y;
			y = y % x;
			x = temp;
		}
		return x;
	}

}
