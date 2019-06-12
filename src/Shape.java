public abstract class Shape implements Drawable{
    private String shapeColor;

    public Shape(String shapeColor){
        this.shapeColor=shapeColor;
    }

     public abstract double calcArea();

    @Override
    public void draw(){
        System.out.println(toString() + ", area: " + calcArea());
    }

    @Override
    public String toString() {
        return "This is "+getClass().getSimpleName()+ ", color is: "+shapeColor;
    }
}
