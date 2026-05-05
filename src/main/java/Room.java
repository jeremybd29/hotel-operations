public class Room {

    //backing variables (instance variables)
    private int roomNumber;
    private String typeRoom;
    private double pricePerNight;
    private boolean isOccupied;

    public Room(int roomNumber, String typeRoom, double pricePerNight, boolean isOccupied){
        this.roomNumber = roomNumber;
        this.typeRoom = typeRoom;
        this.pricePerNight = pricePerNight;
        this.isOccupied = isOccupied;
    }

    //getter methods to access private variables

    public int getRoomNumber(){
        return roomNumber;
    }
    public String getTypeRoom(){
        return typeRoom;
    }
    public double getPricePerNight() {
        return pricePerNight;
    }
    public boolean isOccupied(){
        return isOccupied;
    }
}
