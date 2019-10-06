package mypackage.lab3_ass_3;



import java.util.StringJoiner;

public class MyStringList {
    private int sizeArray=2;
    private String[] strArray = new String[sizeArray];
    String[] MyStringList(){

        return strArray;
    }

    int size = 2;

    public String[] add(String s) {
        if (size == 0) {
            resize(strArray);
        }
        for (int i = 0; i <strArray.length; i++) {
            if (strArray[i] == null) {
                strArray[i] = s;
                size--;
                break;
            }

        }
        return strArray;
    }




    public String get(int i) {
        return strArray[i];

    }

    public boolean find(String s) {
        for (String checkArray:strArray){
            if (checkArray.equals(s)){
                return true;
            }

        }
        return false;

    }

    public boolean remove(String s) {
        int positionRemove=-1;
        for (String checkArray2:strArray){
            positionRemove+=1;
            if (checkArray2.equals(s)){
                System.arraycopy(strArray, positionRemove+1, strArray, positionRemove, strArray.length-positionRemove-1);
                strArray[strArray.length-1]=null;
                size+=1;
                return true;

            }
        }
        return false;

    }

    public String toString() {
        StringJoiner sj= new StringJoiner(",","[","]");
        String addedStrings=" ";
        for (int i=0;i<(strArray.length-size);i++){
            addedStrings=sj.add(strArray[i]).toString();

        }
        return addedStrings;

    }
    public int size(){
        return size;
    }

    public String[] resize(String[] oldArray) {
        System.out.println("Resizing ...");
        String[] newArray = new String[oldArray.length * 2];
       //syntax System.arraycopy();
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
        size = newArray.length - oldArray.length;
        strArray=newArray;
        return newArray;

    }
    public static void main(String[] args) {

            MyStringList l = new MyStringList();
            l.add("Bob");
            System.out.println("The list of size " + l.size()+ " is " + l);
            l.add("Steve");
            System.out.println("The list of size " + l.size() + " is " + l);
            l.add("Susan");
            System.out.println("The list of size " + l.size() + " is " + l);
            l.add("Mark");
            System.out.println("The list of size " + l.size() + " is " + l);
            l.add("Dave");
            System.out.println("The list of size " + l.size() + " is " + l);
            l.remove("Mark");
            System.out.println("The list of size " + l.size() + " is " + l);
            l.remove("Bob");
            System.out.println("The list of size " + l.size() + " is " + l);
        }


    }