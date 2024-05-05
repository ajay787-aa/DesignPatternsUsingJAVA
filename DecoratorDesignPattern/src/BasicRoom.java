public class BasicRoom implements Room{
    int number;
    int cost;

    public BasicRoom(int number,int cost){
        this.number=number;
        this.cost=cost;
    }

    @Override
    public int getTotalCost() {
        return cost;
    }

    @Override
    public int getNumber() {
        return number;
    }
}
