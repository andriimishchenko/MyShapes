public class Triangle extends Shape implements Comparable{
    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public String toString() {
        return super.toString() + ", a=" + a + ", b=" + b + ", c=" + c;
    }
    public int compareTo(Object o) {
        Triangle circle = (Triangle)o;
        if(this.calcArea()>((Triangle) o).calcArea()) return 1;
        if(this.calcArea()<((Triangle) o).calcArea()) return -1;
        return 0;
    }
}