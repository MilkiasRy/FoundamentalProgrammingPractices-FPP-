package lab8_2;


public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = new Node(null, null, null);
	}

	public void addFirst(String item) {
		Node n = new Node(header, item, header.next);
		if (header.next != null) {
			header.next.previous = n;
		}
		header.next = n;

	}

	void printNodes() {
		Node next = header.next;
		if (next == null)
			System.out.println("");
		else {
			String s = next.toString();
			System.out.println(s);
		}
	}
// how to remove element at position or index
	void insert(String data, int pos) {
		if (header.next == null || pos == 0) {
			addFirst(data);
			return;
		}
		Node target = header;
		for (int i = 0; i < pos; i++) {
			if (target.next != null) {
				target = target.next;
			}
		}

		Node newNode = new Node(target.previous, data, target);
		target.previous.next = newNode;
		target.previous = newNode;
	}
// how to remove element ..........
	boolean remove(String data) {
		if (header.next == null)
			return false;

		Node target = header.next;
		while (target != null) {
			if (target.value.equals(data)) {
				if (target.next == null) {
					Node pre = target.previous;
					pre.next = null;
					return true;
				}

				Node preT = target.previous;
				Node nextT = target.next;

				preT.next = nextT;
				nextT.previous = preT;
				return true;
			}
			target = target.next;
		}

		return false;
	}

	class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.next = next;
			this.previous = previous;
			this.value = value;
		}

		@Override
		public String toString() {
			if (value == null)
				return "";
			StringBuilder sb = new StringBuilder(value + " ");
			sb = toString(sb, next);
			return sb.toString();
		}

		private StringBuilder toString(StringBuilder sb, Node n) {
			if (n == null)
				return sb;
			sb.append(n.value + " ");
			return toString(sb, n.next);
		}

	}

	public static void main(String[] args) {
		MyStringLinkedList list = new MyStringLinkedList();

		list.addFirst("A");
		list.addFirst("B");
		list.addFirst("C");
		list.addFirst("2");
		list.addFirst("3");
		list.addFirst("4");
		System.out.println("********************************************");
		System.out.println("                                            ");
		System.out.println("        Display all item                   ");
		list.printNodes();
		System.out.println("inserting element D  at  2 postion");
		list.insert("D", 2);
		list.printNodes();

		System.out.println("removing element B");
		list.remove("A");
		list.printNodes();
		System.out.println("**********************************************");
	}

}