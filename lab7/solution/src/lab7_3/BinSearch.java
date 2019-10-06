package Lab7.src.lab7_3;

import java.util.Arrays;

public class BinSearch {

	public  boolean search(String s, char c) {
		char[] sc = s.toCharArray();
		Arrays.sort(sc);
		s = "";
		for (char k : sc) {
			if (Character.isAlphabetic(k)) {
				s += k;
			}
		}
		return searchMain(s, c);
	}

	private  boolean searchMain(String s, char c) {
		if (s == null || s.length() == 0 )
			return false;
		int len= s.length() / 2;
		if (s.charAt(len) == c)
			return true;
		else if (s.charAt(len) < c) {
			return search(s.substring(len + 1), c);
		} else if (s.charAt(len) > c) {
			return search(s.substring(0, len), c);
		}
		return false;
	}

}
