package exercise;

// BEGIN
public class Flat implements Home {

    private final double mainArea;
    private final double balcony;
    private final int floor;

    public Flat(double mainArea, double balcony, int floor) {
        this.mainArea = mainArea;
        this.balcony = balcony;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return mainArea + balcony;
    }

    @Override
    public int compareTo(Home otherHome) {
        return (int) Math.signum(this.getArea() - otherHome.getArea());
    }

    @Override
    public String toString() {
        return "Квартира площадью " + this.getArea() + " метров на " + floor + " этаже";
    }
}
// END
