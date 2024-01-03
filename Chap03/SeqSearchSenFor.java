package Chap03;

import java.util.Scanner;

public class SeqSearchSenFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num + 1];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값: "); // 키 값을 입력받음
		int key = sc.nextInt();

		int idx = seqSearchSen(x, num, key);

		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
	}
	
	private static int seqSearchSen(int[] x, int num, int key) {
		// 요솟수가 n인 배열 x에서 key와 같은 요소를 보초법으로 선형 검색
		int i;
		x[num] = key; // 보초를 추가
		for (i = 0; i < num; i++) {
			if (x[i] == key)
				break;
		}
		/*
		 for (i = 0; a[i] != key; i++)
		 ;
		 */
		return i == num ? -1 : i;
	}

}
