package Chap04;

import java.util.Scanner;

public class StackTesterEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> s = new Stack<String>(64); //�ִ� 64���� Ǫ���� �� �ִ� ����
		
		while (true) {
			System.out.printf("���� ������ ���� : %d/%d\n",s.size(),s.getCapacity());
			System.out.print("(1)Ǫ�� (2)�� (3)��ũ "+"(4)���� (5)�˻� (6)���"
					+ "(7)��� (0)����");
			int menu = sc.nextInt();
			if (menu == 0) break;
			
			String x;
			
			switch (menu) {
			case 1:
				System.out.print("������ : ");
				x = sc.next();
				try {
					s.push(x);
				}catch(Stack.OverflowGstackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;
			case 2:
				try {
					x = s.pop();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
				}catch(Stack.EmptyGstackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;
			case 3:
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
				}catch(Stack.EmptyGstackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;
			case 4:
				s.dump();
				break;
			case 5:
				System.out.print("�˻��� ������:");
				x = sc.next();
				int n = s.indexOf(x);
				if (n >= 0)
					System.out.println("����⿡�� " + (s.size()-n)+"��°�� �ֽ��ϴ�.");
				else
					System.out.println("�� �����Ͱ� �����ϴ�.");
				break;
			case 6:
				s.clear();
				break;
			case 7:
				System.out.println("�뷮 :"+s.getCapacity());
				System.out.println("�����ͼ� :"+s.size());
				System.out.println("���"+(s.isEmpty() ? "�ֽ��ϴ�.":"�����ϴ�."));
				System.out.println("���� ��"+(s.isFull() ? "�ֽ��ϴ�.":"�����ϴ�."));
				break;
				
			}
		}
		
	}

}
