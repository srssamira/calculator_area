public class Hexagon implements Calculator {

    private double base;
    private double height;
    private double area;

    public Hexagon(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculeArea(){
        area = ((base * height) / 2) * 6;
        return area;
    }

    @Override
    public String toString() {
        return "Hexagon {" +
                "\nbase = " + base +
                "\nheight = " + height +
                "\narea = " + (((base * height) / 2) * 6) +
                "\n}";
    }
}
