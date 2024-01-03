package Chap04;

public class IntArrayQueue {
	private int[] que; //큐용 배열
	private int capacity; //용량
	private int num; //현재 데이터 개수

	//실행 시 예외 : 큐가 비어있음.
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	//실행 시 예외 : 큐가 가득참.
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	//생성자
	public IntArrayQueue(int maxlen) {
		num = 0;
		capacity = maxlen;
		try {
			que = new int[capacity];
		}catch(OutOfMemoryError e) {
			//생성할 수 없음.
			capacity = 0;
		}
	}
	
	//큐에 데이터를 인큐
	public int enque(int x) throws OverflowIntQueueException {
		if (num >= capacity) 
			throw new OverflowIntQueueException(); //큐가 가득참.
		que[num++] = x;
		return x;
	}
	
	//큐에서 데이터를 디큐
	public int deque() throws EmptyIntQueueException {
		if(num <= 0)
			throw new EmptyIntQueueException(); //큐가 비어 있음.
		int x = que[0];
		
		
		return x;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
