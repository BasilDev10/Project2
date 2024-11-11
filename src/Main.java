import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {


        try {


        Route route = new Route("Qurtubah district  ", "An Narjis district", 100);
        Route route2 = new Route("Al Malqa"  ,"Al Saadah",180);

        Car car1 = new Car("KMHYU2" , route , 4);
        Car car2 = new Car("GFDG34", route2 , 2);

        ArrayList <Passenger> passengers = new ArrayList<>();

        Passenger passenger1 = new NonSubPassengers("Mohammad" , "123456789"  , true);
        passenger1.setReservedCar(car1);
        passengers.add(passenger1);
        Passenger passenger2 = new NonSubPassengers("Faisel" , "24234432"  , false);
        passenger2.setReservedCar(car1);
        passengers.add(passenger2);
        Passenger passenger3 = new NonSubPassengers("Abdullah" , "1561532153"  , true);
        passenger3.setReservedCar(car2);
        passengers.add(passenger3);
        Passenger passenger4 = new SubPassengers("Basil" , "151654632"  );
        passenger4.setReservedCar(car2);
        passengers.add(passenger4);

        for (Passenger passenger : passengers) {
            System.out.println(passenger.toString());
            System.out.println("---------------------------------------");
        }

        // maximumCapacity well be zero here well throw Exception
        Passenger passenger5 = new SubPassengers("Sami" , "1234223141"  );
        passenger5.setReservedCar(car2);
        passengers.add(passenger5);

        }catch (Exception e){

            System.out.println(e.getMessage());
        }
    }
}