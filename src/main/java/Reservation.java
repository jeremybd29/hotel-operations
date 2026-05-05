//this class represents a reservation for a hotel room. It connects a guest to a room and calculates total cost
public class Reservation {

    //backing
    private String guestName;
    private Room room;   // reservation has a room object to link to the room being reserved
    private int nights;

    //constructor to initialize reservation object
    public Reservation(String guestName, Room room, int nights) {
        this.guestName = guestName;
        this.room = room;
        this.nights = nights;
    }

    //getters
    public String getGuestName(){
        return guestName;
    }

    public Room getRoom(){
        return room;
    }

    //  derived getter to calculate total cost of reservation based on room price and number of nights
    public double getTotalCost() {
        return room.getPricePerNight() * nights;
    }
}
