package n1exercise1;

public class Instrument {

    public String name;
    public double price;

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    static public void play(Instrument instrument) {
        System.out.println("A " + (instrument.name) + " instrument is being played");
    }
}
