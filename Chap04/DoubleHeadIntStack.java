package Chap04;

public class DoubleHeadIntStack {
	private int[] stk; //������ ��ü
	private int capacity; //������ �뷮
	private int ptrA; //���� ������A
	private int ptrB; //���� ������B
	public enum AorB {StackA, StackB};
	
	//���� �� ���� --������ �������
	public class EmptyDoubleHeadIntStackException extends RuntimeException {
		public EmptyDoubleHeadIntStackException() {}
	}
	
	//���� �� ���� --������ ������
	public class OverflowDoubleHeadIntStackException extends RuntimeException {
		public OverflowDoubleHeadIntStackException() {}
	}
	
	//������
	public DoubleHeadIntStack(int maxlen) {
		ptrA = 0;
		ptrB = maxlen - 1;
		capacity = maxlen;
		try {
			stk = new int[capacity]; //���� ��ü�� �迭�� ����
		}catch (OutOfMemoryError e) { //������ �� ����.
			capacity = 0;
		}
	}
	//������ x�� Ǫ��
	public int push(AorB sw, int x) {
	    if (ptrA >= ptrB+1) {
	    	throw new OverflowDoubleHeadIntStackException();
	    }
	    switch(sw) {
	    case StackA:
	         stk[ptrA++] = x; break;
	    case StackB:
	         stk[ptrB--] = x; break;
	    }
		return x;
	}
	//���ÿ��� �����͸� �� 
	public int pop(AorB sw) {
		int x = 0;
		switch(sw) {
		case StackA:
			if (ptrA <= 0)
				throw new EmptyDoubleHeadIntStackException();
			x = stk[--ptrA];
			break;
		case StackB:
			if (ptrB >= capacity-1)
				throw new OverflowDoubleHeadIntStackException();
			x = stk[++ptrB];
			break;	
		}
		return x;
	}
	//���ÿ��� �����͸� ��ũ
	public int peek(AorB sw) {
		int x = 0;
		switch(sw) {
		case StackA:
			if (ptrA <= 0)
				throw new EmptyDoubleHeadIntStackException();
			x = stk[ptrA-1];
			break;
		case StackB:
			if (ptrB >= capacity-1)
				throw new OverflowDoubleHeadIntStackException();
			x = stk[ptrB+1];
			break;
		}
		return x;
	}
	//--���ÿ��� x�� �˻��Ͽ� �ε��� (�߰����� ���ϸ� -1)�� ��ȯ�մϴ�.
	public int indexOf(AorB sw, int x) {
		switch(sw) {
		case StackA:
			for(int i = ptrA-1; i >= 0; i--) {
				if(stk[i] == x)
					return i; //�˻� ����
			}
			break;
		case StackB:
		    for(int i = ptrB+1; i<capacity; i++) {
		    	if(stk[i] == x)
		    		return i; //�˻� ����
		    }
		    break;
		}
		return -1; //�˻� ����
	}
	//--������ ���ϴ�. --//
	public void clear(AorB sw) {
		switch(sw) {
		case StackA: ptrA = 0; break;
		case StackB: ptrB = capacity - 1; break;
		}
	}
	//--���� �뷮�� ��ȯ�մϴ�.--//
	public int getCapacity() {
		return capacity;
	}
	//���ÿ� �׿��ִ� ������ ���� ��ȯ�մϴ�. --//
	public int size(AorB sw) {
		switch(sw) {
		case StackA:
			return ptrA;
		case StackB:
			return capacity - ptrB - 1;
		}
		return 0;
	}
	//������ ����ִ°�?
	public boolean isEmpty(AorB sw) {
		switch(sw) {
		case StackA:
			return ptrA <= 0;
		case StackB:
			return ptrB >= capacity - 1;
		}
		return true;
	}
	//������ ���� á�°�?
	public boolean isFull() {
		return ptrA >= ptrB+1;
	}
	//���� ���� ��� �����͸� �ٴ� -> ������� ������ ���
	public void dump (AorB sw) {
		switch(sw) {
		case StackA:
			if(ptrA <= 0)
				System.out.println("������ ����ֽ��ϴ�.");
			else {
				for (int i = 0; i<ptrA; i++) {
					System.out.print(stk[i] + "");
				}
				System.out.println();
			}
			break;
		case StackB: 
			if (ptrB >= capacity-1)
				System.out.println("������ ������ϴ�.");
			else {
				for (int i = capacity-1; i>ptrB; i--) {
					System.out.print(stk[i] + "");
				}
				System.out.println();
			}
			break;
		}

	}
	
	
	
	
	
	

	public static void main(String[] args) {
		

	}

}
