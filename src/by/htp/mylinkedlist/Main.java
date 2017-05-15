package by.htp.mylinkedlist;

public class Main {

	public static void main(String[] args) {

		MyLinkedList newList = new MyLinkedList();
		newList.addNode(50); // 0
		newList.addNode(13); // 1
		newList.addNode(7); // 2 - centre
		newList.addNode(28); // 3
		newList.addNode(92); // 4

		newList.insertCentre(81); // new 3
		System.out.println(newList.getNode(3).getData());
	}

}
