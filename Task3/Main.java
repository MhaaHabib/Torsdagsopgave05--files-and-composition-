import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room r = new Room (1,2,3);
        Room room = new Room (3,2,4);
        Room room1 = new Room (5,7,4);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(r);
        rooms.add(room);
        rooms.add(room1);
        Building b = new Building(rooms,1,1,true);
      
    }

    public static int countLampsInBuilding(Building b){
        int counter = 0;
        for ( Room room: b.getRooms()){
            counter += room.getNumberOfLamps();
            }
            return counter;

    }
    public static boolean isNormal(Building building){
        boolean b = false;
        if (building.getNumberOfFloors()> building.getRooms().size()) {
            b= true;

        }
        return b;

    }



}
