package HomeWork_8;

public class P17Main {
    public static void main(String[] args) {
        P17Carpet carpet = new P17Carpet(3.5);
        P17Floor floor = new P17Floor(2.75,4.0);
        P17Calculator calculator = new P17Calculator(floor,carpet);
        System.out.println("total =" + calculator.getTotalcost());
        carpet = new P17Carpet(1.5);
        floor = new P17Floor(5.4,4.5);
        calculator = new P17Calculator(floor,carpet);
        System.out.println("total = " + calculator.getTotalcost());

    }

}
