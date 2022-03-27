package HomeWork_8;

public class P17Carpet {
    double cost;

    public P17Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0.0;
        } else {
            this.cost = cost;
        }
    }
    public double getCost(){
        return this.cost;
    }
}
