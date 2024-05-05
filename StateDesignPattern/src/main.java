import java.util.*;

public class main {
    public static void main(String[] args) {
        //state design pattern mattlab vending maching, like when you know that application will have only states;
        //vending machine has 3 states 1)no coins 2)coins inserted 3)button pressed
        //each state will have a class and implement the state interface.

        VendingMachine vendingMachine = new VendingMachine();
        System.out.println(vendingMachine.getCurrentState());
        vendingMachine.pressButton(10);

        vendingMachine.insertCoin(300);
        vendingMachine.insertCoin(300);
        System.out.println(vendingMachine.getCurrentState()+" amou "+vendingMachine.getAmount());
        vendingMachine.pressButton(10);
        vendingMachine.pressButton(10);


        
    }
}
