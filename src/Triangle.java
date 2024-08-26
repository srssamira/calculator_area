public class Triangle implements Calculator {

    private double base;
    private double height;
    private double area;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculeArea(){
        area = (base * height)/2;
        return area;
    }

    @Override
    public String toString() {
        return "Triangle {" +
                "\nbase = " + base +
                "\nheight = " + height +
                "\narea = " + area +
                "\n}";
    }
}
