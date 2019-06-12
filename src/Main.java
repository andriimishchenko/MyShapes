public class Main {
    public static void main(String[] args) {

        //Shape shape=new Shape("RED");
        Circle circle= new Circle("BLACK",10);
        Circle circle2= new Circle("WHITE",5);

        Rectangle rectangle=new Rectangle("WHITE",2,4);
        Rectangle rectangle1=new Rectangle("PURPLE",3,2);
        Rectangle rectangle2=new Rectangle("GREY",4,3);
        Rectangle rectangle3=new Rectangle("BROWN",5,2);
        Rectangle rectangle4=new Rectangle("YELLOW",6,6);

        Triangle triangle=new Triangle("ROSE",5,5,5);
        Triangle triangle2=new Triangle("GREEN",3,3,3);

        //System.out.println(" ");
        //System.out.println(shape.calcArea());
        //System.out.println(shape);

        System.out.println(" ");
        System.out.println(circle.calcArea());
        System.out.println(circle);

        System.out.println(" ");
        System.out.println(rectangle.calcArea());
        System.out.println(rectangle);

        System.out.println(" ");
        System.out.println(triangle.calcArea());
        System.out.println(triangle);

        Shape[] myShape= {circle,rectangle1,triangle,triangle2,rectangle4,circle2,rectangle3,rectangle2,rectangle};
        double sumRectArea=0.0, sumCircleArea =0.0, sumTriangleArea=0.0, sumArea=0.0;
        for(Shape myshape:myShape) {
            if (myshape instanceof Rectangle) sumRectArea+= myshape.calcArea();
            if (myshape instanceof Circle) sumCircleArea+= myshape.calcArea();
            if (myshape instanceof Triangle) sumTriangleArea+= myshape.calcArea();

            System.out.print(myshape.toString()+", area is: "+myshape.calcArea()+" ");
            sumArea+=myshape.calcArea();

            myshape.draw();

        }
        System.out.println(" ");
        System.out.println("Rectangles total area: "+sumRectArea);
        System.out.println("Circle total area: "+sumCircleArea );
        System.out.println("Triangle total area: "+sumTriangleArea);
        System.out.println("Sum of all shapes area: "+sumArea);

        System.out.println(rectangle.compareTo(rectangle1));
    }

}
