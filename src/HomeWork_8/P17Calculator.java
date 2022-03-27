package HomeWork_8;

public class P17Calculator {
   P17Floor floor;
    P17Carpet carpet;

    public P17Calculator(P17Floor floor,P17Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalcost(){
        return floor.getArea() * carpet.getCost();
    }
}
