package TestPolymorphism;

public class Music {

    public static void tune(Instrument i) {
        i.play(Note.MIDOLE_c);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
