package Lab7.src.lab7_4;

public class DivideSort {
 StringBuilder sBui;

	
public  String divideSort(String s) {
		String sleft = "";
		String sright = "";
		if (s.length() == 0 || s.length() == 1)
			return s;

		int mid = s.length() / 2;
		sright = divideSort(s.substring(mid, s.length()));
		sleft = divideSort(s.substring(0, mid));
		
		sBui= new StringBuilder();
		return merge(sleft, sright);

	}

	public String merge(String right, String left) {

		if (right == null || right.isEmpty()) {
			sBui.append(left);
			return sBui.toString();
		}
		if (left == null || left.isEmpty()) {
			
			sBui.append(right);
			return sBui.toString();
		}
		if (right.charAt(0) <= left.charAt(0)) {
			sBui.append(right.charAt(0));
			return merge(right.substring(1), left);
		} else {
			sBui.append(left.charAt(0));
			return merge(right, left.substring(1));
		}

	}
	

}
