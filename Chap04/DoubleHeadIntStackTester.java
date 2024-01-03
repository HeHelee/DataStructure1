package Chap04;

import java.util.Scanner;

public class DoubleHeadIntStackTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoubleHeadIntStack s = new DoubleHeadIntStack(64); // 최대 64개 푸시할 수 있는 머리가 둘인 스택

		while (true) {
			System.out.println("현재 데이터 갯수 : " + "A : " + s.size(DoubleHeadIntStack.AorB.StackA) + "/" + "B : "
					+ s.size(DoubleHeadIntStack.AorB.StackB));
			System.out.print("(1)A푸시 (2)A팝 (3)A피크" + "(4)A덤프 (5)A검색 (6)A비움\n" + "(7)B푸시 (8)B팝 (9)B피크"
					+ "(10)B덤프 (11)B검색 (12)B비움\n" + "(13)출력 (0)종료");
			int menu = sc.nextInt();
			if (menu == 0)
				break;
			
			int x, n = 0;
			switch (menu) {
			case 1:
				System.out.print("데이터 : ");
				x = sc.nextInt();
				try {
					s.push(DoubleHeadIntStack.AorB.StackA, x);
				} catch (DoubleHeadIntStack.OverflowDoubleHeadIntStackException e) {
					System.out.println("스택이 가득찼습니다.");
				}
				break;
			case 2:
				try {
					x = s.pop(DoubleHeadIntStack.AorB.StackA);
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} catch (DoubleHeadIntStack.OverflowDoubleHeadIntStackException e) {
					System.out.println("스택이 비었습니다.");
				}
				break;
			case 3:
				try {
					x = s.peek(DoubleHeadIntStack.AorB.StackA);
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (DoubleHeadIntStack.EmptyDoubleHeadIntStackException e) {
					System.out.println("스택이 비었습니다.");
				}
				break;
			case 4:
				s.dump(DoubleHeadIntStack.AorB.StackA);
				break;
			case 5:
				System.out.print("검색할 데이터 : ");
				x = sc.nextInt();
				n = s.indexOf(DoubleHeadIntStack.AorB.StackA, x);
				if (n >= 0)
					System.out.println("꼭대기에서 " + (s.size(DoubleHeadIntStack.AorB.StackA) - n) + "번째에 있습니다.");
				else
					System.out.println("그 데이터가 없습니다.");
				break;
			case 6:
				// 비웁니다.
				s.clear(DoubleHeadIntStack.AorB.StackA);
				break;
			case 7:
				System.out.print("데이터 : ");
				x = sc.nextInt();
				try {
					s.push(DoubleHeadIntStack.AorB.StackB, x);
				} catch (DoubleHeadIntStack.OverflowDoubleHeadIntStackException e) {
					System.out.println("스택이 가득찼습니다.");
				}
				break;
			case 8:
				try {
					x = s.pop(DoubleHeadIntStack.AorB.StackB);
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} catch (DoubleHeadIntStack.OverflowDoubleHeadIntStackException e) {
					System.out.println("스택이 비었습니다.");
				}
				break;
			case 9:
				try {
					x = s.peek(DoubleHeadIntStack.AorB.StackB);
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (DoubleHeadIntStack.EmptyDoubleHeadIntStackException e) {
					System.out.println("스택이 비었습니다.");
				}
				break;
			case 10:
				s.dump(DoubleHeadIntStack.AorB.StackB);
				break;
			case 11:
				System.out.print("검색할 데이터 : ");
				x = sc.nextInt();
				n = s.indexOf(DoubleHeadIntStack.AorB.StackB, x);
				if (n >= 0)
					System.out.println("꼭대기에서 " + (s.size(DoubleHeadIntStack.AorB.StackB) - (s.getCapacity() - n) + 1)
							+ "번째에 있습니다.");
				else
					System.out.println("그 데이터가 없습니다.");
				break;
			case 12:
				// 비웁니다.
				s.clear(DoubleHeadIntStack.AorB.StackB);
				break;
			case 13:
				// 데이터 출력
				System.out.println("용량 : " + s.getCapacity());
				System.out.println("A의 데이터수: " + s.size(DoubleHeadIntStack.AorB.StackA));
				System.out.println("B의 데이터수: " + s.size(DoubleHeadIntStack.AorB.StackB));
				System.out.println("A는 비어 " + (s.isEmpty(DoubleHeadIntStack.AorB.StackA) ? "있습니다." : "있지 않습니다."));
				System.out.println("B는 비어 " + (s.isEmpty(DoubleHeadIntStack.AorB.StackB) ? "있습니다." : "있지 않습니다."));
				System.out.println("스택은 가득차" + (s.isFull() ? "있습니다." : "없습니다."));
				break;
			}
		}
	}

}


