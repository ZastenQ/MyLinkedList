package by.htp.mylinkedlist;

public class MyLinkedList {

	private MyNode first;
	private MyNode last;
	private int count;

	public MyLinkedList() {
		this.first = null;
		this.last = null;
		this.count = 0;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public MyNode getFirst() {
		return first;
	}

	public MyNode getLast() {
		return last;
	}

	public int getCount() {
		return count;
	}

	// add new MyNode to the end of MyLinkedList
	public void addNode(Integer value) {
		MyNode newNode = new MyNode(value);

		if (this.isEmpty()) {
			this.first = newNode;
			this.last = newNode;
			this.count++;
		} else {
			this.last.setNext(newNode);
			this.last = newNode;
			this.count++;
		}
	}

	// fill in MyLinkedList by putting new Node to the centre
	public void insertCentre(Integer value) {
		MyNode newNode = new MyNode(value);
		
		MyNode centreNode = this.getNode(this.count / 2);

		newNode.setNext(centreNode.getNext());
		centreNode.setNext(newNode);
		this.count++;
	}

	// get data from MyLinkedList by its index
	public MyNode getNode(int index) {
		MyNode temp = null;
		if (this.isEmpty()) {
			System.out.println("List is empty");
		} else {

			if (index < 0 || index >= this.count) {
				System.out.println("Wrong index!!!");
			} else {
				temp = this.first;
				for (int i = 1; i <= index; i++) {
					temp = temp.getNext();
				}
			}
		}
		return temp;
	}
}
