
	public class Prog8 {
		 public static int min(int[] arrayOfInts){
			 int tempMin=arrayOfInts[0];
			for (int i=1;i<=arrayOfInts.length-1;i++){
				if (tempMin>arrayOfInts[i]){
					tempMin=(arrayOfInts[i]);
					
					
				}
			}
			return tempMin;
		}

		 public static void main (String[] arg){
			 int[] testArray={2,-21,3,45,0,12,18,6,3,1,0,-22};
				int testValue= Prog8.min(testArray);
				System.out.println(testValue);
				int g=Integer.parseInt("4");
				System.out.println("l value "+g);
				String x="haaaaaaklsss";
				StringBuilder y=new StringBuilder(x);
				int l3=y.length();
				System.out.println(l3);
				char[] output=new char[l3];
				int b=0;
				for(int u=0;u<l3;u++){
					boolean get=false;
				for (int i=0;i<u;i++){
					if (x.charAt(u)==x.codePointAt(i)){
						get=true;
					}
				}
				if (get==false){
					output[b]=x.charAt(u);
					b++;
				}
				}
				String outputFinal=String.valueOf(output);
				System.out.println(outputFinal);
				
			 
		 }
		

	}
