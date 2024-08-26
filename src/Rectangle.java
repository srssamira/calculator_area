public class Rectangle implements Calculator {

    private double base;
    private double height;
    private double area;

    public Rectangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculeArea(){
        area = base * height;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "\nbase = " + base +
                "\nheight = " + height +
                "\narea = " + area +
                "\n";
    }
}
