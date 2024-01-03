package Chap03;

import java.util.Scanner;

public class SeqSearchSen {
//요솟수가 n인 배열 a에서 key와 값이 같은 요소를 보초법으로 선형 검색
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num+1]; //요솟수가 num+1인 배열
		
		for (int i = 0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값: "); //키 값을 입력받음
		int ky = sc.nextInt();
		int idx = seqSearchSen(x,num,ky); //배열 x에서 ky인 요소를 검색
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		}
		else 
			System.out.println("그 값의 요소는 x["+idx+"]에 있습니다.");
		

	}

	private static int seqSearchSen(int[] x, int num, int ky) {
		int i = 0;
		x[num] = ky; //보초를 추가
		
		while (true) {
			if(x[i] == ky) //검색 성공
				break;
			i++;
		}
		return i == num ? -1 : i;
	}

}
