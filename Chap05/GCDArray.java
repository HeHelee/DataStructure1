package Chap05;

import java.util.Scanner;

public class GCDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� ������ �ִ� ������� ���ұ��?: ");
		int num;
		do {
			num = sc.nextInt();
		}while(num<=1);
		
		int[] x = new int[num]; //���̰� num�� �迭
		
		for(int i = 0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.println("�ִ� ������� " + gcdArray(x,0,num) + "�Դϴ�.");
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
