package abstractexample23;


//In real scenario,method is called by programmer or user
class Q4TestAbstraction1 {
    public static void main(String[] args) {
        Q1Shape s = new Q3Circle1();//In a real scenario, object is provided through method, e.g., getShape() method
        s.draw();
    }
}

