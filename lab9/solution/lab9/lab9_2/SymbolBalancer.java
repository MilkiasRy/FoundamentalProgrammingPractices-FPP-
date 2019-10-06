package lab9_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer {
	String ODD_DELIMITER = ""+(char)0;
	String filename;
	String text;
	char[] left;
	char[] right;
	public SymbolBalancer(String filename) {
		this.filename = filename;
		readFile();
	}
	public void setText(String text) {
		this.text = text;
	}
	
	boolean symbolsBalanced(String delimiters){
		//implement
		Stack<String>stack=new Stack<>();
		String[]k=text.split("");
		for(String s:k) {
			if(delimiters.contains(s)) {
				if(s.equals("[")||s.equals("{")||s.equals("(")) {
					System.out.println("push"+stack.push(s));
				}
				else if(s.equalsIgnoreCase("]")||s.equals("}")||s.equals(")")) {
					String peek=" ";
					if(stack.empty())return false;
					else peek=stack.peek();
					if(peek.equals("[")&&s.equals("]"))System.out.println(s+"item is found and remove"+stack.pop());
					else if(peek.equals("{")&& s.equals("}"))System.out.println(s+"item is found and remove"+stack.pop());
					else if(peek.equals("(")&& s.equals(")"))System.out.println(s+"item is found and remove"+stack.pop());
				}
			}
		}
		return stack.empty();
		
	}
	
	public static void main(String[] args) {
		SymbolBalancer sb = new SymbolBalancer("prog9_2_startup\\Employee.java");
		System.out.println(sb.symbolsBalanced("[]{}<>()||"));
	}
	void readFile() {
		String prefix = System.getProperty("user.dir") + "\\src\\";
		try {
			Scanner sc = new Scanner(new File(prefix + filename));
			sc.useDelimiter(ODD_DELIMITER);
			text = sc.next();
			System.out.println(text);
			sc.close();
		}
		catch(FileNotFoundException ex) {
			System.err.println("File Not Found Exception "+ex.getMessage());
		}
	}
	
}



