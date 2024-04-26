package io.alecrim.itacademy.sprint1.task1.n1exercise1;

public class PercussionInstrument extends Instrument {
    public PercussionInstrument() {
        super(InstrumentType.PERCUSSION.getName(), 0.0);
    }

    public static void play() {
        System.out.println("A " + (InstrumentType.PERCUSSION.getName()) + " instrument is being played");
    }
}
