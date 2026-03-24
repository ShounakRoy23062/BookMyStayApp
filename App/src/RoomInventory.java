import java.util.*;

public class RoomInventory {

    private Map<String, Integer> rooms;

    public RoomInventory() {
        rooms = new HashMap<>();
        rooms.put("Single", 5);
        rooms.put("Double", 3);
        rooms.put("Suite", 2);
    }

    public int getAvailability(String roomType) {
        return rooms.getOrDefault(roomType, 0);
    }

    public void decrementRoom(String roomType) {
        rooms.put(roomType, rooms.get(roomType) - 1);
    }

    public Map<String, Integer> getAllRooms() {
        return rooms;
    }
}