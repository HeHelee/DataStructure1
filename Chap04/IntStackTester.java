package Chap04;

import java.util.Scanner;

public class IntStackTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(64); //�ִ� 64���� Ǫ���� �� �ִ� ����
		
		while(true) {
			System.out.println(); //�޴� ������ ���� �� �� �߰�
			System.out.printf("���� ������ ���� : %d / %d\n",s.size(),s.getCapacity());
			System.out.print("(1) Ǫ�� (2) �� (3) ��ũ (4) ���� (5) �˻� (6) ���� ����  (0) ����: ");
			
			int menu = sc.nextInt();
			if (menu == 0) break;
			
			int x;
			switch(menu) {
			case 1: 
				System.out.print("������: "); //Ǫ��
				x = sc.nextInt();
				try {
					s.push(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;
				
				
			case 2: 
				try {
					x = s.pop();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("������ ������ϴ�.");
				}
				break;
				
			case 3: 
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x +"�Դϴ�.");
				}catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ������ϴ�.");
				}
				break;
				
			case 4: 
				s.dump(); //����
				break;
			}
		}
				

	}

}
