package io.alecrim.itacademy.sprint1.task1.n1exercise1;

public class StringInstrument extends Instrument {
    public StringInstrument() {
        super(InstrumentType.STRING.getName(), 0.0);
    }

    public static void play() {
        System.out.println("A " + (InstrumentType.STRING.getName()) + " instrument is being played");
    }
}
