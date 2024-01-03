package Chap03;

import java.util.Scanner;

public class SearchIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("��ڼ�: ");
		int num = sc.nextInt();
		int a[] = new int[num];
		int idx[] = new int[num]; // ��ڼ��� num�� �迭 2�� ����

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			a[i] = sc.nextInt();
		}

		System.out.print("�˻��� ��: ");
		int key = sc.nextInt();
		int count = searchIdx(a, num, key, idx);
		if (count == 0)
			System.out.println("�� ���� ��Ҵ� �����ϴ�.");
		else {
			for (int i = 0; i < count; i++)
				System.out.println("�� ���� " + "a[" + idx[i] + "]�� �ֽ��ϴ�.");
		}
	}

	private static int searchIdx(int[] a, int num, int key, int[] idx) {
		int count = 0;
		for (int i = 0; i < num; i++) {
			if (a[i] == key) {
				idx[count++] = i;
			}
		}
		return count;
	}

}
