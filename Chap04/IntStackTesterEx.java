package Chap04;

import java.util.Scanner;

public class IntStackTesterEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(64); // ���� ����

		while (true) {
			System.out.println();
			System.out.print("(1)Ǫ�� (2)�� (3)��ũ (4)���� (5)�˻� (6)����� (7)��� (0)����");
			int menu = sc.nextInt();
			if (menu == 0)
				break;
			int x;
			switch (menu) {
			case 1:
				System.out.print("�� �Է�:");
				x = sc.nextInt();
				try {
					s.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;
			case 2:
				try {
					x = s.pop();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ������ϴ�.");
				}
				break;
			case 3:
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ������ϴ�.");
				}
				break;
			case 4:
				s.dump();
				break;
			case 5:
				System.out.println("�˻��ϰ� ���� ���� �Է��Ͻÿ�: ");
				x = sc.nextInt();
				if (x > 0) {
					s.indexOf(x);
					System.out.println("�ش� �����ʹ� ����⿡�� " + (s.size() - x) + "�� °�� �ֽ��ϴ�.");
				} else {
					System.out.println("�ش� �����Ͱ� �����ϴ�.");
				}
				break;
			case 6:
				s.clear();
				break;
			case 7: 
				System.out.println("�뷮 :"+s.getCapacity());
				System.out.println("������ �� :"+ s.size());
				System.out.println("��� " + (s.isEmpty()?"�ֽ��ϴ�.":"�����ϴ�."));
				System.out.println("���� �� " + (s.isFull()?"�ֽ��ϴ�.":"�����ϴ�."));
				break;
			}
		}
	}
}
