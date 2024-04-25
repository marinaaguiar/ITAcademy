package n2exercise1;

public class Main {

    public static void main(String[] args) {
        Smartphone iPhone = new Smartphone("Apple", "iPhone X");
        System.out.println("Brand: " + iPhone.brand + " Model: " + iPhone.model);
        iPhone.alarm();
        iPhone.photograph();
        iPhone.call("682912873");
    }
}