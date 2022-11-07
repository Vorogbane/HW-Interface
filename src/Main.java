import transport.*;

public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus("LIAZ", "l1", 5.3);
        Bus bus2 = new Bus("GAZ", "GazelleNext", 4);
        Bus bus3 = new Bus("MAZ", "b2", 4.2);
        Bus bus4 = new Bus("PAZ", "R23", 3.2);
        Car car1 = new Car("GAZ", "Volga", 2.0);
        Car car2 = new Car("VAZ", "2107", 1.6);
        Car car3 = new Car("TAGAZ", "S123", 1.8);
        Car car4 = new Car("UAZ", "Patriot", 2.5);
        Truck truck1 = new Truck("KAMAZ", "FG233", 10.0);
        Truck truc2 = new Truck("MAN", "R432", 12.0);
        Truck truck3 = new Truck("MAZ", "tr431", 9.5);
        Truck truck4 = new Truck("VOLVO", "A456B", 12.6);

        Driver_B volodimir = new Driver_B<>("Владимир Ильич Брежнев", "B", 3);
        System.out.println(volodimir.moveTransport(car1));
        System.out.println(volodimir.claimContesting(car1));
        Driver_C igor = new Driver_C<>("Nikitin Igor Valerievich", "C", 5);
        System.out.println(igor.claimContesting(bus3));

    }
}