public abstract class Passenger {
    private String name;
    private String id;
    private Car reservedCar;
    private double tripCost;

    public Passenger(String name, String id ) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public Car getReservedCar() {
        return reservedCar;
    }
    public void setReservedCar(Car reservedCar ) throws Exception{
        if(reservedCar.getMaximumCapacity()>0){
            reservedCar.setMaximumCapacity(reservedCar.getMaximumCapacity()-1);
            this.reservedCar = reservedCar;
            this.tripCost = computeTripCost(reservedCar );
        }else {
            throw new Exception("car "+reservedCar.getCode()+" is full");
        }

    }
    public double getTripCost() {
        return tripCost;
    }
    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }
    public abstract double computeTripCost(Car car );

    public String toString(){
        return "Name: "+name+"\nID: "+id+"\nTrip Cost: "+tripCost+"\nReserved Car: ("+reservedCar+")";
    }
}
