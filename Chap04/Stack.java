package Chap04;

public class Stack<E> {
	private E[] stk; //스택용 배열
	private int capacity; //스택 용량
	private int ptr; //스택 포인터
	
	//실행 시 예외 : 스택이 비어 있음.
	public static class EmptyGstackException extends RuntimeException {
		public EmptyGstackException() {}
	}
	//실행 시 예외 : 스택이 가득 참.
	public static class OverflowGstackException extends RuntimeException {
		public OverflowGstackException() {}
	}
	
	//생성자
	public Stack (int maxlen) {	
		ptr = 0;
		capacity = maxlen;
		try {
			stk = (E[])new Object[capacity]; //스택 본체용 배열을 생성
		}catch(OutOfMemoryError e) { //생성할 수 없음.
			capacity = 0;
		}
	}
	
	//스택에 x를 푸쉬
	public E push(E x) throws OverflowGstackException {
		if (ptr >= capacity)
	//스택이 가득참
			throw new OverflowGstackException();
		return stk[ptr++] = x;
	}
	
	//스택에서 데이터를 팝 (꼭대기의 데이터를 꺼냄)
	public E pop() throws EmptyGstackException {
		if (ptr<=0)
			throw new EmptyGstackException();
		return stk[--ptr];
	}
	
	//스택에서 데이터를 피크 (꼭대기의 데이터를 내려다봄)
	public E peek() throws EmptyGstackException {
		if (ptr <= 0)
			throw new EmptyGstackException();
		return stk[ptr-1];
	}
	
	//스택을 비웁니다.
	public void clear() {
		ptr = 0;
	}
	
	//스택에서 x를 검색하여 인덱스를 발견하지 못하면 반환합니다.
	public int indexOf(E x) {
		for (int i = ptr-1; i>=0; i--) {
			if(stk[i].equals(x))
				return i; //검색 성공
		}
		return -1; //검색 실패
	}
	
	//스택 용량을 반환합니다.
	public int getCapacity() {
		return capacity;
	}
	
	//스택에 쌓여있는 데이터 수를 반환합니다.
	public int size() {
		return ptr;
	}
	
	//스택이 비어 있는가?
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	//스택이 가득 찼는가?
	public boolean isFull() {
		return ptr >= capacity;
	}
	
	//스택 안의 모든 데이터를 바단 -> 꼭대기의 순서로 출력
	public void dump() {
		if (ptr <= 0)
			System.out.println("스택이 비어 있습니다.");
		else {
			for (int i = 0; i<ptr; i++) 
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
