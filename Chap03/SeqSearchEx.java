package Chap03;

import java.util.Scanner;

public class SeqSearchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int a[] = new int[num]; // 요솟수가 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			a[i] = sc.nextInt();
		}

		System.out.print("검색할 값:");
		int key = sc.nextInt();
		int idx = seqSearch(a, num, key); // 배열 a에서 값이 key인 요소를 검색

		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
	}

	private static int seqSearch(int[] a, int num, int key) {
		System.out.print("    |");
		for (int k = 0; k < num; k++) {
			System.out.printf("%4d", k);
		}
		System.out.println();

		System.out.print("----+");
		for (int k = 0; k < num * 4 + 2; k++)
			System.out.print("-");
		System.out.println();

		for (int i = 0; i < num; i++) {
			System.out.print("    |");
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
			System.out.printf("%4d|", i);
			for (int k = 0; k < num; k++) {
				System.out.printf("%4d", a[k]);
			}
			System.out.println("\n    |");
			if (a[i] == key)
				return i; // 검색 성공
		}
		return -1; // 검색 실패
	}
}
