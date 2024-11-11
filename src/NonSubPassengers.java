public class NonSubPassengers extends Passenger{

    private boolean isHasCoupon = false;

    public NonSubPassengers(String name, String id  ,boolean isHasCoupon) {
        super(name, id);
        this.isHasCoupon = isHasCoupon;
    }

    @Override
    public double computeTripCost(Car car ) {
        double price = car.getRoute().getPrice();
        if(this.isHasCoupon){
            return price -(price*0.1);
        }else return price;

    }
    @Override
    public String toString() {
        return super.toString() + "\nis a non sub passenger\nHas coupon:"+this.isHasCoupon;
    }
}
