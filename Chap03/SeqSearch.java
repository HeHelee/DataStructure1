package Chap03;
//선형 검색
import java.util.Scanner;

public class SeqSearch {
//요솟수가 n인 배열 a에서 key와 값이 같은 요소를 선형 검색
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
  
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num]; // 요솟수가 num인 배열

		for (int i = 0; i < x.length; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}

		System.out.print("검색할 값:");
		int ky = sc.nextInt();
		int idx = seqSearch(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색

		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
	}

	private static int seqSearch(int[] x, int num, int ky) {
		int i = 0;
		while (true) {
			if (i == num)
				return -1; // 검색 실패 (-1을 반환)
			if (x[i] == ky)
				return i;
			i++;
		}
	}

}
