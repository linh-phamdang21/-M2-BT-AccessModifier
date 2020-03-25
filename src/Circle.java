public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return Math.PI * this.getRadius() * this.getRadius();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(15);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}