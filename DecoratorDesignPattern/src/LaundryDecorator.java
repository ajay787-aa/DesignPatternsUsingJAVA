public class LaundryDecorator implements RoomDecorator{
    Room room;

    LaundryDecorator(Room room){
        this.room=room;
    }

    public int getTotalCost() {
        return room.getTotalCost()+100;
    }


    public int getNumber() {
        return room.getNumber();
    }
}
