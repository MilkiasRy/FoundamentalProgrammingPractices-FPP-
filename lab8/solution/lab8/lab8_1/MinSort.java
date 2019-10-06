package lab8_1;

import java.util.Arrays;

public class MinSort {
	String[]arr;
	MinSort(String[] arr){
		this.arr = arr;
	}
	public void sort(){
		if(arr == null || arr.length <=1) return;
		int len = arr.length;
		int temp = 0;
		for(int i = 0; i < len; ++i){
			int nextMinPos = minpos(i,len-1);
			swap(i,nextMinPos); 
		}
		
	}
	void swap(int i, int j){
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	//find minimum of arr between the indices bottom and top
	public int minpos(int bottom, int top){	
		if(bottom > arr.length || top > arr.length) return -1;
	
		String  m = arr[bottom];
		int index = bottom;
		if(bottom>top)return index;
		for(int i = bottom+1; i <= top; ++i){
			//compareTo  and chage if(arr[i]<m
			if(i<arr.length&&arr[i].compareTo(m)<0) {
				m = arr[i];
				index = i;
			}
		}
		//return location of min, not the min itself
		return index;
	}
	public String[]getMyStringArray(){
		return arr;
	}
	@Override
	public String toString() {
		return "MinSort [arr =  "+" " + Arrays.toString(arr) + "]";
	}
	
	}
