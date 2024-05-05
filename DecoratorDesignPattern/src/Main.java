//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //as the name suggest this pattern is for decorating
        //example : build a hotel reservation system
        //every hotel has a room some rooms are basics some are premium and some have added decoration which come
        //with additional fees.
        //you can use both interface and abstract class over here

        Room room=new BasicRoom(10,200);
        RoomDecorator roomDecorator=new LaundryDecorator(room);

    }
}