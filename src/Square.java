public class Square implements Calculator {

    private double sizeA;
    private double area;

    public Square(double sizeA) {
        this.sizeA = sizeA;
    }

    @Override
    public double calculeArea(){
        area = sizeA * sizeA;
        return area;
    }

    @Override
    public String toString() {
        return "Square {" +
                "\nsizeA = " + sizeA +
                "\narea = " + area +
                "\n}";
    }
}
