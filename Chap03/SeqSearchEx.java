package Chap03;

import java.util.Scanner;

public class SeqSearchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("��ڼ�: ");
		int num = sc.nextInt();
		int a[] = new int[num]; // ��ڼ��� num�� �迭

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			a[i] = sc.nextInt();
		}

		System.out.print("�˻��� ��:");
		int key = sc.nextInt();
		int idx = seqSearch(a, num, key); // �迭 a���� ���� key�� ��Ҹ� �˻�

		if (idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		} else
			System.out.println("�� ���� x[" + idx + "]�� �ֽ��ϴ�.");
	}

	private static int seqSearch(int[] a, int num, int key) {
		System.out.print("    |");
		for (int k = 0; k < num; k++) {
			System.out.printf("%4d", k);
		}
		System.out.println();

		System.out.print("----+");
		for (int k = 0; k < num * 4 + 2; k++)
			System.out.print("-");
		System.out.println();

		for (int i = 0; i < num; i++) {
			System.out.print("    |");
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
			System.out.printf("%4d|", i);
			for (int k = 0; k < num; k++) {
				System.out.printf("%4d", a[k]);
			}
			System.out.println("\n    |");
			if (a[i] == key)
				return i; // �˻� ����
		}
		return -1; // �˻� ����
	}
}
