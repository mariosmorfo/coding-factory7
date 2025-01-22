package gr.aueb.cf.ch17.knight;

public class KnightMain {

    private final static Runnable joa = new Knight("joa");
    private final static Runnable whiteKnight = new Knight("White-Knight");
    private final static Runnable saintGeorge = new Knight("SaintGeorge");

    public static void main(String[] args) {
        (new Thread(joa)). start();
        (new Thread(whiteKnight)). start();
        (new Thread(saintGeorge)). start();

    }
}
