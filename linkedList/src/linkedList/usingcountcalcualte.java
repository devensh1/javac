package linkedList;

import java.util.Scanner;

public class usingcountcalcualte {
	
	public static node<Integer> createlinkedlist(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		node<Integer> head = null;
		while(data!=-1) {
			node<Integer> currentnode = new node<>(data);
			if(head ==null) {
				head = currentnode;
			}
			else {
				node<Integer> tail = head;
				while(tail.next!=null) {
					tail = tail.next;
				}
				tail.next = currentnode;
				
			}
			data = s.nextInt();
		}
		
		return head;
	}
	
	public static void countno(node<Integer> head) {
		while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		}
		
	}

	public static void main(String[] args) {
		node<Integer> head = createlinkedlist();
		countno(head);

	}

}
