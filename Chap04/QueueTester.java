package Chap04;

import java.util.Scanner;

import Chap04.Queue.EmptyGqueueException;

public class QueueTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<String> s = new Queue<String>(64); // �ִ� 64���� ���� �� ����.

		while (true) {
			System.out.printf("���� ������ ���� : %d / %d\n", s.size(), s.getcapacity());
			System.out.print("(1)��ť (2)��ť (3)��ť " + "(4)���� (5)�˻� (0)����: ");

			int menu = sc.nextInt();
			if (menu == 0)
				break;

			int idx;
			String x;

			switch (menu) {
			// ��ť
			case 1:
				System.out.print("������ : ");
				x = sc.next();
				try {
					s.enque(x);
				} catch (Queue.OverflowGqueueException e) {
					System.out.println("ť�� ����á���ϴ�.");
				}
				break;

			case 2:
				// ��ť
				try {
					x = s.deque();
					System.out.println("��ť�� �����ʹ� " + x + "�Դϴ�.");
				} catch (Queue.EmptyGqueueException e) {
					System.out.println("ť�� ����ֽ��ϴ�.");
				}
				break;
			case 3:
				// ��ũ
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
				} catch (Queue.EmptyGqueueException e) {
					System.out.println("ť�� ����ֽ��ϴ�.");
				}
				break;
			case 4:
				// ����
				s.dump();
				break;

			case 5:
				// �˻�
				System.out.print("������ :");
				String str = sc.next();
				int n = s.search(str);
				if (n!=0)
					System.out.printf("%d��° �����ͷ� �ε��� %d�� ��ġ�� ����Ǿ� �ֽ��ϴ�.\n"
							,n,s.indexOf(str));
				else
					System.out.println("�� �����ʹ� ��ϵǾ� ���� �ʽ��ϴ�.");
				break;

			}

		}
	}
}
