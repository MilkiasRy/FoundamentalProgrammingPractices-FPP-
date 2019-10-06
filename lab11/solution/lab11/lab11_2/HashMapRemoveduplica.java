package lab11_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HashMapRemoveduplica {
	
	
	boolean checkForSum(List<Integer>list,Integer z) {
		HashMap<Integer, Integer> l=new HashMap<Integer,Integer>();
		if(list==null) {
			l.put(list.get(0), l.get(0));
		}
		else
		return false;
		for(int i=0;i<l.size();i++) {
			if(l.containsKey(z-l.get(i))) {
				return true;
			}
			l.put(list.get(i), l.get(i));
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapRemoveduplica m=new	HashMapRemoveduplica ();
		System.out.println(" checking deplicate :"+m.checkForSum(Arrays.asList(3,4,5,5,6),11));
		

	}

}
