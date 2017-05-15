package by.htp.mylinkedlist;

public class MyNode {

	private Integer data;
	private MyNode next;

	public MyNode(int data) {
		this.data = data;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public MyNode getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}

}
