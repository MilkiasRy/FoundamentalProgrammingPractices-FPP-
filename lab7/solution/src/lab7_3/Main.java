
package Lab7.src.lab7_3;

public class Main {
	public static void main(String[] args) {
		BinSearch b=new BinSearch();
		String s = "Servlet config object represent single servlet";
		char c = 'j';
		char d='z';
		System.out.println(b.search(s,c));
		System.out.println(b.search(s,d));
	}

}
