package Chap03;
//이진 검색
import java.util.*;
public class BinSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 정렬하세요.");
		
		System.out.print("x[0]: ");
		x[0] = sc.nextInt();
		
		for(int i = 1; i<num; i++) {
			do {
				System.out.print("x["+i+"]: ");
				x[i] = sc.nextInt();
			}while(x[i] < x[i-1]); //바로 앞의 요소보다 작으면 다시 입력받음.
		}
		
		System.out.print("검색할 값: ");
		int ky = sc.nextInt();
		
		int idx = binSearch(x,num,ky); //배열 x에서 값이 ky인 요소를 검색
		
		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		}
		else {
			System.out.println("그 값은 x["+idx+"]에 있습니다.");
		}

	}

	private static int binSearch(int[] x, int num, int ky) {
		int pl = 0;
		int pr = num-1;
		
		do {
			int pc = (pl+pr)/2; //중앙 요소의 인덱스
			if (x[pc] == ky)
				return pc; //검색 성공 !
			else if (x[pc] < ky)
				pl = pc+1;
			else
				pr = pc-1;
		}while(pl <= pr);
		return -1; //검색 실패 !
	}

}
