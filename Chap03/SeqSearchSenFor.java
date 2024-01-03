package Chap03;

import java.util.Scanner;

public class SeqSearchSenFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("��ڼ�: ");
		int num = sc.nextInt();
		int[] x = new int[num + 1];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("�˻��� ��: "); // Ű ���� �Է¹���
		int key = sc.nextInt();

		int idx = seqSearchSen(x, num, key);

		if (idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		} else
			System.out.println("�� ���� x[" + idx + "]�� �ֽ��ϴ�.");
	}
	
	private static int seqSearchSen(int[] x, int num, int key) {
		// ��ڼ��� n�� �迭 x���� key�� ���� ��Ҹ� ���ʹ����� ���� �˻�
		int i;
		x[num] = key; // ���ʸ� �߰�
		for (i = 0; i < num; i++) {
			if (x[i] == key)
				break;
		}
		/*
		 for (i = 0; a[i] != key; i++)
		 ;
		 */
		return i == num ? -1 : i;
	}

}
