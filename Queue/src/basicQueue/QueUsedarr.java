package basicQueue;

public class QueUsedarr {

	public static void main(String[] args) throws queuefullexception, queueemptyexception {
		QueueUsingArray queue = new QueueUsingArray(10);
		
		int a[] = {4,5,34,6};
		for(int i=0; i<a.length; i++) {
			queue.enqueu(a[i]);
		}
		while(! queue.isEmpty()) {
			System.out.println(queue.dequeu());
		}
		
	}

}
