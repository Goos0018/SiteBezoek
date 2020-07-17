package be.vdab;

import java.util.Random;

public class Tijd {

    private int uren;
    private int minuten;
    private int seconden;
    private int honderdsten;

    private static Random random = new Random();

    public Tijd() {
    }

    public Tijd(int uren, int minuten, int seconden, int honderdsten) {
        this.uren = uren;
        this.minuten = minuten;
        this.seconden = seconden;
        this.honderdsten = honderdsten;
    }

    public int getUren() {
        return uren;
    }

    public int getMinuten() {
        return minuten;
    }

    public int getSeconden() {
        return seconden;
    }

    public int getHonderdsten() {
        return honderdsten;
    }

    public int toInteger(){
       return 0;

    }

    @Override
    public String toString() {
        return uren +":"+ minuten +":"+ seconden +":"+ honderdsten;
    }

    public void maakRandomTijd(){
        uren = (int) random.nextInt(24);
        minuten= (int) random.nextInt(60);
        seconden = (int) random.nextInt(60);
        honderdsten = (int) random.nextInt(100);

    }
}
