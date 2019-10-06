package mypackage.lab3_ass_4;

public final class Rectangle {
    private static double width;
    private static double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double computeArea(){
return width*length;
    }

}
