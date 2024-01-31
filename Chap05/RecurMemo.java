package Chap05;

import java.util.Scanner;

public class RecurMemo {
	static String[] memo;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int x = sc.nextInt();
		
		memo = new String[x+2];
		recur(x);

	}
	
	//�޸�ȭ�� ������ recur �޼ҵ�
	private static void recur(int n) {
		if (memo[n+1] != null) {
			System.out.print(memo[n+1]); //�޸� ���
		}
		else {
			if (n>0) {
				recur(n-1);
				System.out.println(n);
				recur(n-2);
				memo[n+1] = memo[n] + n +"\n" + memo[n-1]; //�޸�ȭ
			}
			else {
				memo[n+1] = ""; //�޸�ȭ : recur(0)�� recur(-1)�� �� ���ڿ�
			}
		}
	}
}
