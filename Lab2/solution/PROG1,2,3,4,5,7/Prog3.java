
public class Prog3 {
    public static void main(String[] args) {


        float num1=1.27f,num2=3.881f, num3=9.6f;

        //casting the sum to type int
        int sum1=(int) (num1+num2+num3);

        int sum2=Math.round(num1+num2+num3);//correct way



        System.out.println("The sum of the floats as an integer:"+" "+num1+ "+ " + num2+ " +"+ num3+" :"+"\n"+
                "SumOffloats: "+sum1+"\n"+"Sum as integer as rounding: "+sum2);





    }
}
