public class VehicleRunner
{
    public static void main(String[] args)
    {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn(90);
        myVehicle.brake(0.25);

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(-90); // inherited method
        myCar.brake(0.50); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR TEST CODE BELOW! ----
        // testing all available methods on a Bicycle object

        Bicycle myBicycle = new Bicycle("Citi Bike", 2, 3);
        System.out.println(myBicycle.getName());
        System.out.println(myBicycle.getWheels());
        System.out.println(myBicycle.getGearCount());
        myBicycle.move(20);
        myBicycle.brake(-35);
        myBicycle.ringBell();

        Bus myBus = new Bus("Citi Bike", 2, 18);
        System.out.println(myBus.getName());
        System.out.println(myBus.getWheels());
        System.out.println(myBus.getWindowCount());
        myBus.move(20);
        myBus.brake(-35);
        myBus.honk();
    }
}