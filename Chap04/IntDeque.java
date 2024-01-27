package Chap04;

public class IntDeque {
	// 실행 시 예외 : 큐가 비어 있음.
	public class EmptyIntDequeException extends RuntimeException {
		public EmptyIntDequeException() {
		}
	}

	// 실행 시 예외 : 큐가 가득 참
	public class OverflowIntDequeException extends RuntimeException {
		public OverflowIntDequeException() {
		}
	}

	private int[] que; // 덱의 본체
	private int capacity; // 덱의 용량
	private int num; // 현재 데이터 개수
	private int front; // 맨앞 요소 커서
	private int rear; // 맨끝 요소 커서

	// 생성자
	public IntDeque(int maxlen) {
		num = front = rear = 0;
		capacity = maxlen;
		try {
			que = new int[capacity]; // 덱본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없음
			capacity = 0;
		}
	}

	// 덱의 맨 앞에 데이터를 인큐
	public int enqueFront(int x) throws OverflowIntDequeException {
		if (num >= capacity)
			throw new OverflowIntDequeException(); // 덱이 가득참
		if (--front < 0)
			front = capacity - 1;
		que[front] = x;
		return x;
	}

	// 덱의 맨 끝에 데이터를 인큐
	public int enqueRear(int x) throws OverflowIntDequeException {
		if (num >= capacity)
			throw new OverflowIntDequeException(); // 덱이 가득참.
		que[rear++] = x;
		num++;
		if (rear == capacity)
			rear = 0;
		return x;
	}

	// 덱의 맨 앞에 데이터를 디큐
	public int dequeFront() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException(); // 덱이 비었음.
		int x = que[front++];
		num--;
		if (front == capacity)
			front = 0;
		return x;
	}

	// 덱의 맨 끝에 데이터를 디큐
	public int dequeRear() throws EmptyIntDequeException {
		if (num <= 0) {
			throw new EmptyIntDequeException(); // 덱이 비었음.
		}
		num--;
		if (--rear < 0)
			rear = capacity - 1;
		return que[rear];

	}

	// 덱의 맨 앞 데이터를 피크 (맨 앞 데이터를 들여다봄)
	public int peekFront() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException(); // 덱이 비어있음.
		return que[front];
	}

	// 덱의 맨 끝 데이터를 피크 (맨 끝 데이터를 들여다봄)
	public int peekRear() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException(); // 덱이 비어있음.
		return que[rear == 0 ? capacity - 1 : rear - 1];
	}

	// 덱에서 x를 검색하여 인덱스(발견하지 못하면 -1)
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % capacity;
			if (que[idx] == x)
				return idx;
		}
		return -1; // 검색 실패
	}

	public int search(int x) {
		for (int i = 0; i < num; i++)
			if (que[(i + front) % capacity] == x)
				return i + 1; // 검색 성공
		return 0;
	}

	// 덱을 비웁니다.
	public void clear() {
		num = front = rear = 0;
	}

	// 덱의 용량을 반환합니다.
	public int getCapacity() {
		return capacity;
	}

	// 덱이 쌓여있는 데이터 수를 반환합니다.
	public int size() {
		return num;
	}

	// 덱이 비어 있는가 ?
	public boolean isEmpty() {
		return num <= 0;
	}

	// 덱이 가득 찼는가 ?
	public boolean isFull() {
		return num >= capacity;
	}

	// 덱 안의 모든 데이터를 맨앞 -> 맨끝의 순서로 출력
	public void dump() {
		if (num <= 0)
			System.out.println("덱이 비었습니다.");
		else {
			for (int i = 0; i < num; i++) {
				System.out.print(que[(i + front) % capacity] + " ");
			}
			System.out.println();
		}
	}

}

