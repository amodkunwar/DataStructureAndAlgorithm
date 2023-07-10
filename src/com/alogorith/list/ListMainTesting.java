package com.alogorith.list;

public class ListMainTesting {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Amod", "Kunwar");
		Employee employee2 = new Employee("Pramod", "Kunwar");

		EmployeeLinkedList list = new EmployeeLinkedList();
		System.out.println(list.size());
		list.addToFront(employee1);
		list.addToFront(employee2);

		list.printList();
		System.out.println();
		System.out.println(list.size());
		
		System.out.println("***************");
		
		list.removeNodeFromFront();
		
		list.printList();
		System.out.println();
		System.out.println(list.size());
	}

}
