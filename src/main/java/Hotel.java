
//tracks available rooms, booked rooms, and room types (suite and basic rooms)
public class Hotel {

    //backing variables for hotel class
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    //constructor w/ zero bookings

    public Hotel (String name, int numberOfSuites, int numberOfRooms){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    //Constructors to initialize hotel object with existing bookings
    public Hotel (String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }
    //getters
    public String getName(){
        return name;
    }
    public int getNumberOfSuites(){
        return numberOfSuites;
    }
    public int getNumberOfRooms(){
        return numberOfRooms;
    }
    public int getBookedSuites(){
        return bookedBasicRooms;
    }
    //derived getter, calculate suites w/ no backing variable.
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }
    //derived getter for basic room w/ no backing variable
    public int getAvailableRooms(){
        return numberOfRooms - bookedBasicRooms;
    }

    //booking logic for suites and basic rooms
    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if (isSuite) {
            //checks if suites are available, if so books them and returns true, otherwise returns false
            if (getAvailableSuites() >= numberOfRooms) {
                bookedSuites += numberOfRooms;
                return true;
            } else {
                return false;
            }
        } else {
            // checks if basic rooms are available, if so books them and returns true, otherwise returns false
            if (getAvailableRooms() >= numberOfRooms) {
                bookedBasicRooms += numberOfRooms;
                return true;
            } else {
                return false;
            }
        }
    }
}
