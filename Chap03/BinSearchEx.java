package Chap03;

import java.util.Scanner;

public class BinSearchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��Ҽ� �Է�: ");
		int num = sc.nextInt();
		int[] x = new int[num]; //��ڼ��� num�� �迭
		
		System.out.println("������������ �Է��ϼ���");
		
		System.out.print("x[0]: ");
		x[0] = sc.nextInt();
		
		for(int i = 1; i<num; i++) {
			do {
				System.out.print("x["+i+"]: ");
				x[i] = sc.nextInt();
			}while(x[i] < x[i-1]); //�ٷ� ���� ��Һ��� ������ �ٽ� �Է¹���.
		}
		
		System.out.print("�˻��� ��: ");
		int key = sc.nextInt();
		
		int idx = seqSearch(x,num,key);
		
		if(idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		}
		else
			System.out.println("�� ���� x["+idx+"]�� �ֽ��ϴ�.");

	}

	private static int seqSearch(int[] x, int num, int key) {
		System.out.print("   |");
		for (int k = 0; k<num; k++) 
			System.out.printf("%4d",k);
		System.out.println();
		
		System.out.print("---+");
		for(int k = 0; k<num*4+2; k++) 
			System.out.print("-");
		System.out.println();
		
        int pl = 0;
        int pr = num-1;
      
        do {
        	int pc = (pl+pr)/2; //�߾� ����� �ε���
        	System.out.print("   |");
        	if (pl != pc)
        		System.out.printf(String.format("%%%ds<-%%%ds+", (pl*4)+1,(pc-pl)*4), "","");
        	else
        		System.out.printf(String.format("%%%ds<-+", pc*4+1),"");
        	if (pl != pc)
        		System.out.printf(String.format("%%%ds->\n", (pr-pc)*4-2),"");
        	else
        		System.out.println("->");
        	
        	System.out.printf("%3d|",pc);
        	for (int k = 0; k<num; k++)
        		System.out.printf("%4d",x[k]);
        	System.out.println("\n   |");
        	if(x[pc] == key)
        		return pc;
        	else if (x[pc] < key)
        		pl = pc+1; //�˻� ����� �������� ����.
        	else
        	    pr = pc-1; //�˻� ����� �������� ����.
        	
        }while(pl <= pr);
		
		
		return -1;
	}

}
