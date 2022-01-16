package Hackerrank_DS;
import java.util.Scanner;

public class doublyLinkedList {

	

	public static class Node {
		int data;
		Node prev;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	static Scanner ob = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Insert at first
		// INsert at last
		// INsert in the middle
		// Delete a given Node if data matches
		// Print the whole DoublyLinkedList
		
		System.out.println("1. Insert at first\n" + "2. Normal insertion\n" + "3. INsert in the middle\n"
				+ "4. Delete a given Node if data matches\n" + "5. Print the whole DoublyLinkedList");
		System.out.println("Enter 0 [ ZERO ] to Quit...");
		
		
		Node head = null;
	//	int ch = 1;
/*
		while (ch != 0) {
			System.out.println("\n\nEnter Choice: ");

			ch = ob.nextInt();
			switch (ch) {
			case 1: {
				System.out.println("Enter data to be stored :");
				int d = ob.nextInt();
				 head = insertNode(head, d);
				break;
			}

			case 2: {
				System.out.print("\nEnter the number of Nodes : ");
				int n = ob.nextInt();
				while (n > 0) {
					n -= 1;
					System.out.print("\nEnter data to be stored :");
					int d = ob.nextInt();
					head = insertLast(head, d);
				}
				break;
			}

			case 3: {
				System.out.print("\nEnter the element after which the new element needs to be stored: ");
				int s = ob.nextInt();
				System.out.print("\nEnter data to be stored :");
				int d = ob.nextInt();
				head = insertInBetween(head, d, s);
				break;

			}

			case 4: {
				System.out.print("Enter data to be deleted :");
				int d = ob.nextInt();
				head = deleteNode(head, d);
				break;
			}
			case 5: {
				System.out.println();
				print(head);
				break;
			}

			default: {
				System.out.println("Invalid Entry....");

			}

			}

		}
		*/
		
		head = insertLast(head, 10);
		
		head = insertLast(head, 20);
		head =insertLast(head, 30);
		head =insertLast(head, 40);
		head =insertLast(head, 50);
		head =insertLast(head, 60);
		print(head);
		
		
	}

	public static Node insertNode(Node head1, int data) {

		Node current = head1;
		Node temp = new Node(data);
		// if the head is empty
		if (current == null) {
			temp = current;
		} else {
			while (current.next != null) {
				current = current.next;
			}
			current.next = temp;
			temp.prev = current;
		}
		return head1;
	}

	// search for a data in the linkedlist and insert a value after that node;
	public static Node insertInBetween(Node head1, int data, int search) {
		Node current = head1;
		Node temp = new Node(data);

		while (current.next != null) {
			if (current.data == search) {
				Node tempNode = current.next;
				current.next = temp;
				temp.prev = current;
				temp.next = tempNode;
				tempNode.prev = temp;
			} else {
				System.out.println("Data not found.");
			}
			current = current.next;
		}
		if (current.next == null) {
			current = insertNode(current, data);
		}

		return head1;
	}

	// if user wants to insert at the last Node
	public static Node insertLast(Node head1, int data) {
		Node current = head1;
		Node temp = new Node(data);
		if (current == null) {
			current = insertNode(current, data);
		} else {
			while (current.next != null) {
				current = current.next;
			}
			temp.prev = current;
			current.next = temp;

		}
		System.out.println("*****"+head1.data);
		return head1;
	}
	// if user wants to delete a node by giving the data of that node

	public static Node deleteNode(Node head1, int search) {
		Node current = head1;
		while (current != null) {
			if (current.data == search) {
				Node tempNext = current.next;
				Node tempPrev = current.prev;
				current = tempNext;
				current.prev = tempPrev;
			} else {
				System.out.println("Element not found.");
			}
		}

		return head1;
	}

	// print a doublyLinkedList when head is given
	public static void print(Node head1) {
		Node current = head1;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
	}
}
