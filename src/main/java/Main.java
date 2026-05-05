public class Main {

    // room object
    public static void main(String[] args) {
        Room room1 = new Room(101, "Double", 150.0, false);

        //employee  object
        Employee emp1 = new Employee("John Cena", "Manager", 25.0, 40);

        // reservation object using room
        Reservation res1 = new Reservation("Brock Lesnar", room1, 3);

        //test
        System.out.println("Room Number: " + room1.getRoomNumber());
        System.out.println("Room Price: $" + room1.getPricePerNight());

        // Demonstrates derived getter
        System.out.println("Employee Total Pay: $" + emp1.getTotalSalary());

        // Demonstrates object relationship + derived calculation
        System.out.println("Reservation Total Cost: $" + res1.getTotalCost());
    }
}
