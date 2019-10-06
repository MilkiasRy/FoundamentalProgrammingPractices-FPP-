package lab3_3.package2;

import lab10_3.Sorter;

public class BSTSort extends Sorter {
	
	@Override
	public int[] sort(int[] arr) {
		MyBST m=new MyBST();
		m.insertAll(arr);
		return m.readIntoArray();
	}
}
