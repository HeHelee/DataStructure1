package Chap03;
//���� �˻�
import java.util.Scanner;

public class SeqSearch {
//��ڼ��� n�� �迭 a���� key�� ���� ���� ��Ҹ� ���� �˻�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
  
		System.out.print("��ڼ�: ");
		int num = sc.nextInt();
		int[] x = new int[num]; // ��ڼ��� num�� �迭

		for (int i = 0; i < x.length; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}

		System.out.print("�˻��� ��:");
		int ky = sc.nextInt();
		int idx = seqSearch(x, num, ky); // �迭 x���� ���� ky�� ��Ҹ� �˻�

		if (idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		} else
			System.out.println("�� ���� x[" + idx + "]�� �ֽ��ϴ�.");
	}

	private static int seqSearch(int[] x, int num, int ky) {
		int i = 0;
		while (true) {
			if (i == num)
				return -1; // �˻� ���� (-1�� ��ȯ)
			if (x[i] == ky)
				return i;
			i++;
		}
	}

}
