package linkedList;

public class baisclinked {

	public static void main(String[] args) {
		node n1 = new node(10);
		System.out.println(n1.data);
		node n2 = new node(20);
		node n3 = new node(30);
		n1.next = n2;
		n2.next = n3;
		System.out.println(n1);
		
		System.out.println(n2.next.data);
		System.out.println(n3.next);

	}

}
