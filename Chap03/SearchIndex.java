package Chap03;

import java.util.Scanner;

public class SearchIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int a[] = new int[num];
		int idx[] = new int[num]; // 요솟수가 num인 배열 2개 생성

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			a[i] = sc.nextInt();
		}

		System.out.print("검색할 값: ");
		int key = sc.nextInt();
		int count = searchIdx(a, num, key, idx);
		if (count == 0)
			System.out.println("그 값의 요소는 없습니다.");
		else {
			for (int i = 0; i < count; i++)
				System.out.println("그 값은 " + "a[" + idx[i] + "]에 있습니다.");
		}
	}

	private static int searchIdx(int[] a, int num, int key, int[] idx) {
		int count = 0;
		for (int i = 0; i < num; i++) {
			if (a[i] == key) {
				idx[count++] = i;
			}
		}
		return count;
	}

}
