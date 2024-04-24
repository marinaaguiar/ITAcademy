package n1exercise1;

public class Main {
    public static void main(String[] args) {

        Instrument[] instruments = {new PercussionInstrument(), new StringInstrument(), new WindInstrument()};

        for (Instrument i : instruments) {
            Instrument.play(i);
        }
    }
}
