package Chap04;

import java.util.Scanner;

import Chap04.IntDeque.EmptyIntDequeException;

public class IntDequeTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntDeque s = new IntDeque(64);
		
		while(true) {
			System.out.printf("���� ������ ���� : %d / %d\n",s.size(),s.getCapacity());
			System.out.print("(1)�Ǿտ� ��ť (2)�Ǿտ��� ��ť (3)�� �տ��� ��ũ\n" + 
			"(4)�ǳ��� ��ť (5)�ǳ����� ��ť (6)�ǳ����� ��ũ\n" +
					"(7)���� (8)�˻� (0)���� : ");
			
			int menu = sc.nextInt();
			if (menu == 0)
				break;
			
			int x,idx = 0;
			
			switch(menu) {
			case 1:
				System.out.print("������");
				x = sc.nextInt();
				try {
					s.enqueFront(x);
				}catch(IntDeque.OverflowIntDequeException e) {
					System.out.println("ť�� ����á���ϴ�.");
				}
				break;
			case 2:
				try {
					x = s.dequeFront();
					System.out.println("��ť�� �����ʹ� " + x +"�Դϴ�.");
				}catch(IntDeque.EmptyIntDequeException e) {
					System.out.println("ť�� ����ֽ��ϴ�.");
				}
				break;
			case 3:
				try {
					x = s.peekFront();
					System.out.println("��ũ�� �����ʹ� "+ x +"�Դϴ�.");
				}catch(IntDeque.EmptyIntDequeException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;
			case 4: //�� �ڿ� ��ť
				System.out.print("������ : ");
				x = sc.nextInt();
				try {
					s.enqueRear(x);
				}catch(IntDeque.OverflowIntDequeException e) {
					System.out.println("ť�� ���� á���ϴ�.");
				}
				break;
			case 5: //�� �ڿ� ��ť
				try {
					x = s.dequeRear();
					System.out.println("��ť�� �����ʹ� "+x+"�Դϴ�.");
				}catch(IntDeque.EmptyIntDequeException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;
			case 6: //�� �ڿ��� ��ũ
				try {
					x = s.peekRear();
					System.out.println("��ũ�� �����ʹ� "+x+"�Դϴ�/");
				}catch(IntDeque.EmptyIntDequeException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;
			case 7:
				s.dump();
				break;
			case 8:
				System.out.print("������ : ");//�˻�
				x = sc.nextInt();
				int n = s.search(x);
				if (n!=0)
					System.out.printf("%d��° �����ͷ� �ε��� %d�� ��ġ�� ����Ǿ� �ֽ��ϴ�.\n",n,s.indexOf(x));
				else {
					System.out.println("�� �����ʹ� ��ϵǾ� ���� �ʽ��ϴ�.");
				}
				break;

			}
			
			
			
		}

	}

}
