package assignment6_1;

public class Main {

	public static void main(String[] args) {
		MyTable t = new MyTable();
		
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		
		
//		System.out.println("the value of c :" + t.get('c'));
		System.out.println(t);
	}

}
