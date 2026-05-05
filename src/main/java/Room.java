public class Room {

    //backing variables (instance variables)
    private int roomNumber;
    private String typeRoom;
    private double pricePerNight;
    private boolean isOccupied;
    private boolean isClean;

    public Room(int roomNumber, String typeRoom, double pricePerNight, boolean isOccupied, boolean isClean) {
        this.roomNumber = roomNumber;
        this.typeRoom = typeRoom;
        this.pricePerNight = pricePerNight;
        this.isOccupied = isOccupied;
        this.isClean = isClean();
    }

    //getter methods to access private variables

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isClean() {
        return isClean;
    }

    // methods, check guest into room
    // only allows checkin if room is not occupied
    public void checkIn() {
        if (!isOccupied) {
            isOccupied = true;
            System.out.println("Checked into room " + roomNumber);
        } else {
            System.out.println("Room " + roomNumber + " is already occupied.");
        }
    }
        // checks guest out of room and marks room as not occupied and dirty.
        public void checkOut(){
            if (isOccupied) {
                isOccupied = false;
                isClean = false; // room becomes dirty being checkedout
            } else {
                System.out.println("Room " + roomNumber + " is already vacant.");
            }
        }


    // marks room as dirty
    public void markDirty() {
        isClean = false;
    }

    // Room is cleaned
    public void cleanRoom() {
        isClean = true;
    }

}
