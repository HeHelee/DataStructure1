package Chap03;

import java.util.Scanner;

public class SeqSearchFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		System.out.print("검색할 값: ");
		int ky = sc.nextInt();
		int idx = seqSearch(x, num, ky);

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
	}

	private static int seqSearch(int[] x, int num, int ky) {
		// 요솟수가 n인 배열 x에서 key와 값이 같은 요소를 선형 검색
		for (int i = 0; i < num; i++) {
			if (x[i] == ky)
				return i; // 검색 성공(인덱스를 반환)
		}
		return -1;
	}
}
