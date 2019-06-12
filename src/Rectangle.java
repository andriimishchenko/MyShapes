public class Rectangle extends Shape implements Comparable{
    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    public double calcArea(){
        return height*width;
    }


    @Override
    public String toString() {

        return super.toString()+", width="+width+", height="+height;
    }

    public int compareTo(Object o) {
        Rectangle circle = (Rectangle)o;
        if(this.calcArea()>((Rectangle) o).calcArea()) return 1;
        if(this.calcArea()<((Rectangle) o).calcArea()) return -1;
        return 0;
    }
}
