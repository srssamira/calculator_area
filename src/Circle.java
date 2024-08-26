public class Circle implements Calculator {

    private double pi = 3.14;
    private double ray;
    private double result;

    public Circle(double pi, double ray) {
        this.pi = pi;
        this.ray = ray;
    }

    @Override
    public double calculeArea(){
        result = pi * (ray * ray);
        return result;
    }

    @Override
    public String toString() {
        return "Circle {" +
                "\npi = " + pi +
                "\nray = " + ray +
                "\narea = " + result +
                "\n}";
    }
}
