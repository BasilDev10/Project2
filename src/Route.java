public class Route {
    private String pickUp;
    private String dropOff;
    private double price;

    public Route(String pickUp, String dropOff, double price) {
        this.pickUp = pickUp;
        this.dropOff = dropOff;
        this.price = price;
    }
    public String getPickUp() {
        return pickUp;
    }
    public String getDropOff() {
        return dropOff;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setPickUp(String pickUp) {
        this.pickUp = pickUp;
    }
    public void setDropOff(String dropOff) {
        this.dropOff = dropOff;
    }
    public String toString() {
        return  "pickUp: " + pickUp + "\ndropOff: " + dropOff;
    }
}
