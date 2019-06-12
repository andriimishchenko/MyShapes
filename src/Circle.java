public class Circle extends Shape implements Comparable{
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    public double calcArea(){
        return  Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return super.toString()+", radius= " +radius;
    }

    public int compareTo(Object o) {
        Circle circle = (Circle)o;
        if(this.calcArea()>((Circle) o).calcArea()) return 1;
        if(this.calcArea()<((Circle) o).calcArea()) return -1;
        return 0;
    }
}
