import java.io.*;



public class Prog4 {


    public static void main(String[] args) throws IOException {

        String records=Data.records;
     String[] dataRecord=records.split(":");

     for (String x:dataRecord){
         int i;

         i=x.indexOf(",");
         String data=x.substring(0,i);
         System.out.println(data);
    }
}}
