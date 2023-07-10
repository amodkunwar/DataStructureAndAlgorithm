package com.alogorith.list;

public class Node {

	private Node next;

	private Employee employee;
	
	public Node(Employee employee) {
		this.employee = employee;
	}

	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	@Override
	public String toString() {
		return employee.toString();
	}

}
