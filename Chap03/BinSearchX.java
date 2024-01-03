package Chap03;

import java.util.Scanner;

public class BinSearchX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("��ڼ� : ");
		int num = sc.nextInt();
		int x[] = new int[num];

		System.out.println("������������ �Է��ϼ���");

		System.out.print("x[0]: ");
		x[0] = sc.nextInt();
		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]: ");
				x[i] = sc.nextInt();
			} while (x[i] < x[i - 1]);
		}

		System.out.print("�˻��� ��: ");
		int key = sc.nextInt();

		int idx = binSearchX(x, num, key);

		if (idx == -1) {
			System.out.println("�˻��� ���� �����ϴ�.");
		} else
			System.out.println("�� ���� x[" + idx + "]�� �ֽ��ϴ�.");
	}

	private static int binSearchX(int[] x, int num, int key) {
		int pl = 0;
		int pr = num - 1;

		do {
			int pc = (pl + pr) / 2;
			if (x[pc] == key) {
				for (; pc > pl; pc--)
					if (x[pc - 1] < key)
						break;
				return pc;
			}
			else if (x[pc] < key)
				pl = pc + 1;
			else
				pr = pc - 1;

		} while (pl <= pr);
		return -1;
	}

}
