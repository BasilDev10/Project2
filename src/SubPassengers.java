public class SubPassengers extends Passenger{
    public SubPassengers(String name, String id ) {
        super(name, id);
    }

    @Override
    public double computeTripCost(Car car ) {
        double price = car.getRoute().getPrice();
        return price*0.5;
    }
    @Override
    public String toString() {
        return super.toString() + "\nis a sub passenger";
    }
}
