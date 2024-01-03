package Chap03;
//���� �˻�
import java.util.*;
public class BinSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ�: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("������������ �����ϼ���.");
		
		System.out.print("x[0]: ");
		x[0] = sc.nextInt();
		
		for(int i = 1; i<num; i++) {
			do {
				System.out.print("x["+i+"]: ");
				x[i] = sc.nextInt();
			}while(x[i] < x[i-1]); //�ٷ� ���� ��Һ��� ������ �ٽ� �Է¹���.
		}
		
		System.out.print("�˻��� ��: ");
		int ky = sc.nextInt();
		
		int idx = binSearch(x,num,ky); //�迭 x���� ���� ky�� ��Ҹ� �˻�
		
		if (idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		}
		else {
			System.out.println("�� ���� x["+idx+"]�� �ֽ��ϴ�.");
		}

	}

	private static int binSearch(int[] x, int num, int ky) {
		int pl = 0;
		int pr = num-1;
		
		do {
			int pc = (pl+pr)/2; //�߾� ����� �ε���
			if (x[pc] == ky)
				return pc; //�˻� ���� !
			else if (x[pc] < ky)
				pl = pc+1;
			else
				pr = pc-1;
		}while(pl <= pr);
		return -1; //�˻� ���� !
	}

}
