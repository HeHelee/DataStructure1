package Chap03;

import java.util.Scanner;

public class BinSearchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소수 입력: ");
		int num = sc.nextInt();
		int[] x = new int[num]; //요솟수가 num인 배열
		
		System.out.println("오름차순으로 입력하세요");
		
		System.out.print("x[0]: ");
		x[0] = sc.nextInt();
		
		for(int i = 1; i<num; i++) {
			do {
				System.out.print("x["+i+"]: ");
				x[i] = sc.nextInt();
			}while(x[i] < x[i-1]); //바로 앞의 요소보다 작으면 다시 입력받음.
		}
		
		System.out.print("검색할 값: ");
		int key = sc.nextInt();
		
		int idx = seqSearch(x,num,key);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		}
		else
			System.out.println("그 값은 x["+idx+"]에 있습니다.");

	}

	private static int seqSearch(int[] x, int num, int key) {
		System.out.print("   |");
		for (int k = 0; k<num; k++) 
			System.out.printf("%4d",k);
		System.out.println();
		
		System.out.print("---+");
		for(int k = 0; k<num*4+2; k++) 
			System.out.print("-");
		System.out.println();
		
        int pl = 0;
        int pr = num-1;
      
        do {
        	int pc = (pl+pr)/2; //중앙 요소의 인덱스
        	System.out.print("   |");
        	if (pl != pc)
        		System.out.printf(String.format("%%%ds<-%%%ds+", (pl*4)+1,(pc-pl)*4), "","");
        	else
        		System.out.printf(String.format("%%%ds<-+", pc*4+1),"");
        	if (pl != pc)
        		System.out.printf(String.format("%%%ds->\n", (pr-pc)*4-2),"");
        	else
        		System.out.println("->");
        	
        	System.out.printf("%3d|",pc);
        	for (int k = 0; k<num; k++)
        		System.out.printf("%4d",x[k]);
        	System.out.println("\n   |");
        	if(x[pc] == key)
        		return pc;
        	else if (x[pc] < key)
        		pl = pc+1; //검색 결과를 뒷쪽으로 좁힘.
        	else
        	    pr = pc-1; //검색 결과를 앞쪽으로 좁힘.
        	
        }while(pl <= pr);
		
		
		return -1;
	}

}
