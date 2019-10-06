
    public class Prog7 {

        public static void main(String[] args){
            String result= " ";
            int l=16;
            int[] arr=new int[16];
            for (int i=0;i<16;i++){
                arr[i]=RandomNumbers.getRandomInt(99,1);
            }

            result=String.format("%16d %12d %12d %12d  %n %n",arr[0],arr[1],arr[2],arr[3]);
            result+=String.format("%13s %2d %9s %2d  ","+",arr[4],"+",arr[5]);
            result+=String.format("%8s %1d %9s %1d %n","+",arr[6],"+",arr[7]);
            result+=String.format("%16s %12s %12s %12s %n %n  ","____", "____","____", "____");
            result+=String.format("%14d %12d %12d %12d  %n %n",arr[8],arr[9],arr[10],arr[11]);
            result+=String.format("%13s %2d %9s %2d  ","+",arr[12],"+",arr[13]);
            result+=String.format("%8s %1d %9s %1d %n","+",arr[14],"+",arr[15]);
            result+=String.format("%16s %12s %12s %12s  ","____", "____","____", "____");
            System.out.println(result);
        }

    }





