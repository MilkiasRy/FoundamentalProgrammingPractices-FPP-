package mypackage.lab3_ass_4;

public final class Circle {
    public Circle(int radius) {
        this.radius = radius;
    }

    private static int radius;

    public static double computeArea(){
return Math.round( Math.PI* Math.pow(radius,2));
    }
}
