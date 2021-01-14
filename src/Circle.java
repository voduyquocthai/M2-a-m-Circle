public class Circle {
    private double radius = 1.0;
    private String color = "red";
    Circle(){};
    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.pow(this.radius,2) * 3.14;
    }

    public static void main(String[] args) {
        Circle c =  new Circle(8.0);
        System.out.println("Bán kính và diện tích của hình tròn là:" + c.getRadius() +" " + c.getArea());
    }
}
