package Lab7.src.lab7_2;

public class MinSort {
	public String  sort(String s) {
		
		    if (s.length() < 2) {
		        return s;
		    }

		    int pos = 0;
		    char min = s.charAt(0);
		    for(int i = 1; i < s.length(); i++) {
		        char c = s.charAt(i);
		        if (c < min) {
		            min = c;
		            pos = i;
		        }
		    }

		   

		    return min + sort(s.substring(0, pos) + s.substring(pos + 1));
		}
		
	
public static void main(String []args) {
	 MinSort ms = new MinSort();
	  String result = ms.sort("oole");
	  System.out.println(result);

}
}