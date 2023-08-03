package exercise;

// BEGIN
public class Cottage implements Home{
    private final double area;
    private final int floor;

    public Cottage(double area, int floor) {
        this.area = area;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int compareTo(Home otherHome) {
        return (int) Math.signum(this.getArea() - otherHome.getArea());
    }

    @Override
    public String toString() {
        return floor + " этажный коттедж площадью " + this.getArea() + " метров";
    }
}
// END
