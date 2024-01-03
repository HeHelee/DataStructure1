package Chap03;

import java.util.Scanner;

public class SeqSearchFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ڼ�: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		System.out.print("�˻��� ��: ");
		int ky = sc.nextInt();
		int idx = seqSearch(x, num, ky);

		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println("�� ���� x[" + idx + "]�� �ֽ��ϴ�.");
	}

	private static int seqSearch(int[] x, int num, int ky) {
		// ��ڼ��� n�� �迭 x���� key�� ���� ���� ��Ҹ� ���� �˻�
		for (int i = 0; i < num; i++) {
			if (x[i] == ky)
				return i; // �˻� ����(�ε����� ��ȯ)
		}
		return -1;
	}
}
