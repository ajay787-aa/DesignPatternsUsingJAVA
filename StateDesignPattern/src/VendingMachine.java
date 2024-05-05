public class VendingMachine implements MachineState {
    private   int amount;

    public MachineState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(MachineState currentState) {
        this.currentState = currentState;
    }

    private MachineState currentState;

    VendingMachine(){

        //the default state
        this.currentState=new NoCoinsInsertedState(this);
    }
    public int getAmount() {
        return amount;
    }
    public void addAmount(int amount) {
        this.amount = this.amount+amount;
    }

    @Override
    public void insertCoin(int amount) {

        currentState.insertCoin(amount);
    }

    @Override
    public void pressButton(int key) {
        currentState.pressButton(2);
        //todo
    }
}
