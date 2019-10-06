import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args) {
        Scanner temp=new Scanner(System.in);
        System.out.println("hello! how may I help?");
        String user=temp.nextLine();
        for (int i=user.length()-1;i>=0;i--){
            System.out.print(user.charAt(i)+" ");

        }
    }
}
