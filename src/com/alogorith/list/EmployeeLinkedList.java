package com.alogorith.list;

public class EmployeeLinkedList {

	private Node head;

	private int size;

	/**
	 * @return the head
	 */
	public Node getHead() {
		return head;
	}

	/**
	 * @param head the head to set
	 */
	public void setHead(Node head) {
		this.head = head;
	}

	public void addToFront(Employee employee) {
		Node node = new Node(employee);
		node.setNext(head);
		head = node;
		size++;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void printList() {
		Node current = head;
		System.out.print("Head --> ");
		while (current != null) {
			System.out.print(current);
			System.out.print("--> ");
			current = current.getNext();
		}
		System.out.print("null");
	}

	public Node removeNodeFromFront() {
		if (isEmpty()) {
			return null;
		}
		Node removeNode = head;
		head = removeNode.getNext();
		removeNode.setNext(null);
		size--;
		return removeNode;
	}

}
