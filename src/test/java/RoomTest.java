import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class RoomTest {

    @Test
    public void testCheckIn_success() {
        //Arrange
        Room room = new Room(101, "Double", 100.0,false,true);

        //Act
        room.checkIn();

        //Assert
        assertTrue(room.isOccupied());
        assertFalse(room.isClean());
    }

    @Test
    public void testCheckOut() {
        Room room = new Room(101,"Double", 100.0,true,true);

        room.checkOut();

        assertFalse(room.isOccupied());
        assertFalse(room.isClean());
        }


    @Test
    public void testCleanRoom_success() {
        Room room = new Room(101, "Double",100.0, false, false);

        room.cleanRoom();

        assertTrue(room.isClean());
    }
}