

public class Prog6 {
	public static String[] removeDups(String[] arr){
		
        String[] temp=new String[arr.length];
        int index=0;
		for (int i=0;i<arr.length;i++){
			 boolean ifAvailable=false;
			for (int j=0;j<index;j++){
				if (arr[i]==(temp[j])){
					ifAvailable= true;
					break;
				}
				
			
			}
			if(!ifAvailable){
				temp[index]=arr[i];
				index++;
			}
		}
		String[] array= new String[index];
for(int i=0;i<index;i++){
	array[i]=temp[i];		
}
			
			return array;	
	}

	public static void main(String[] args) {
		String[] arr={"horse","dog","cat","horse","dog"};
		String[] result=Prog6.removeDups(arr);
		
		for(String s:result)
		System.out.print(s+" ,");
	}
}
