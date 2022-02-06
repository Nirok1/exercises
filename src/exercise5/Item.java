package exercise5;

public class Item {
    public int volume;
    public int cost;
    public Item(int volume, int cost){
        this.cost = cost;
        this.volume = volume;
    }
    public int getCost(){
        return cost;
    }
    public int getVolume() {
        return volume;
    }
}
