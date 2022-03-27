package HomeWork_8;
//Display right angle triangle of @ using nested for loops
public class Program8 {
    public static void righttriangle() {
        int i, j, row = 5;
        for (i = 0; i < row; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        {
            righttriangle();
        }
    }
}