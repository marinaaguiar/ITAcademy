package io.alecrim.itacademy.sprint1.task1.n1exercise1;

public class WindInstrument extends Instrument {
    public WindInstrument() {
        super(InstrumentType.WIND.getName(), 0.0);
    }

    public static void play() {
        System.out.println("A " + (InstrumentType.STRING.getName()) + " instrument is being played");
    }
}
