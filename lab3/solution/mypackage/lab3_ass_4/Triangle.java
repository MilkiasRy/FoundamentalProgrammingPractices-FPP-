package mypackage.lab3_ass_4;

public   class Triangle {



    private static double base;
    private static double height;
    private static double area;
    private  double side1;
    private  double side2;
    private  double side3;

    public Triangle(double side1,double side2, double side3) {



       this.base=Math.max(side1,Math.max(side2,side3));
        this.side3=side3;
        double value1= Math.pow(base,2)+Math.pow(side2,2)-Math.pow(side3, 2);
        double value2=Math.pow(value1/(2*base),2);
        this.height=Math.sqrt(Math.pow(side2, 2)-value2);
  }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    private double length;
    public static double computeArea(){

        area=0.5*base*height;
        return area;



    }

    public  double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}
