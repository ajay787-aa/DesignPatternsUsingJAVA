public class NoCoinsInsertedState implements MachineState{
    VendingMachine vendingMachine;

    NoCoinsInsertedState(VendingMachine vendingMachine){
        this.vendingMachine=vendingMachine;
    }
    NoCoinsInsertedState(){}

    //we can insert coin here
    //also in this state the insert coin can be calculated multiple times.
    @Override
    public void insertCoin(int amount) {

        vendingMachine.setCurrentState(new CoinInsertedState(vendingMachine));
        vendingMachine.addAmount(amount); //because 1st time we have to change the state;

         // like a setter we can say
    }


    //obviously we cannot call this method from this state
    // add custom exception handler here
    @Override
    public void pressButton(int key) {
        System.out.println("paise dallo bhai phelle");
    }
}
