package Chap04;

import java.util.Scanner;

public class IntStackTesterEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(64); // 스택 생성

		while (true) {
			System.out.println();
			System.out.print("(1)푸쉬 (2)팝 (3)피크 (4)덤프 (5)검색 (6)지우기 (7)출력 (0)종료");
			int menu = sc.nextInt();
			if (menu == 0)
				break;
			int x;
			switch (menu) {
			case 1:
				System.out.print("값 입력:");
				x = sc.nextInt();
				try {
					s.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			case 2:
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비었습니다.");
				}
				break;
			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비었습니다.");
				}
				break;
			case 4:
				s.dump();
				break;
			case 5:
				System.out.println("검색하고 싶은 값을 입력하시오: ");
				x = sc.nextInt();
				if (x > 0) {
					s.indexOf(x);
					System.out.println("해당 데이터는 꼭대기에서 " + (s.size() - x) + "번 째에 있습니다.");
				} else {
					System.out.println("해당 데이터가 없습니다.");
				}
				break;
			case 6:
				s.clear();
				break;
			case 7: 
				System.out.println("용량 :"+s.getCapacity());
				System.out.println("데이터 수 :"+ s.size());
				System.out.println("비어 " + (s.isEmpty()?"있습니다.":"없습니다."));
				System.out.println("가득 차 " + (s.isFull()?"있습니다.":"없습니다."));
				break;
			}
		}
	}
}
