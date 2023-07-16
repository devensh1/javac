package basicQueue;

public class QueueUsingArray {
	
	private int data[];
	private int front;
	private int rear;
	private int size;
	
	
	public QueueUsingArray(int capacity) {
		this.data = data;
		int data[] = new int[capacity];
		front = -1;
		rear = -1;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(size==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public void enqueu(int elem) throws queuefullexception {
		if(size==data.length) {
			throw new queuefullexception();
		}
		
		if(size==0) {
			front =0;
		}
		rear++;
		if(rear==data.length) {
			rear=0;
		}
		data[rear] = elem;
		size++;
	}
	
	public int dequeu() throws queueemptyexception {
		if(front==-1) {
			throw new queueemptyexception();
		}
		if(size==0) {
			front=-1;
			rear =-1;
		}
		int temp = front;
		front++;
		if(front==data.length) {
			front =0;
		}
		size--;
		return temp;
		
	}
	

}
