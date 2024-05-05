public class CoinInsertedState implements MachineState{
    VendingMachine vendingMachine;

    CoinInsertedState(VendingMachine vendingMachine){
        this.vendingMachine=vendingMachine;
    }
    @Override
    public void insertCoin(int amount) {
        vendingMachine.addAmount(amount);
    }

    @Override
    public void pressButton(int key) {
        System.out.println("apka saman lelo bhai " + key);
        vendingMachine.setCurrentState(new NoCoinsInsertedState());
    }
}
