package Chap03;

import java.util.Scanner;

public class SeqSearchSen {
//��ڼ��� n�� �迭 a���� key�� ���� ���� ��Ҹ� ���ʹ����� ���� �˻�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ�: ");
		int num = sc.nextInt();
		int[] x = new int[num+1]; //��ڼ��� num+1�� �迭
		
		for (int i = 0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("�˻��� ��: "); //Ű ���� �Է¹���
		int ky = sc.nextInt();
		int idx = seqSearchSen(x,num,ky); //�迭 x���� ky�� ��Ҹ� �˻�
		
		if(idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		}
		else 
			System.out.println("�� ���� ��Ҵ� x["+idx+"]�� �ֽ��ϴ�.");
		

	}

	private static int seqSearchSen(int[] x, int num, int ky) {
		int i = 0;
		x[num] = ky; //���ʸ� �߰�
		
		while (true) {
			if(x[i] == ky) //�˻� ����
				break;
			i++;
		}
		return i == num ? -1 : i;
	}

}
