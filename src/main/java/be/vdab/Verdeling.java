package be.vdab;

public class Verdeling {

    static final int AANTAL = 1000;

    private Tijd[] tijden;
    private int[] uren;

    public Verdeling() {
        tijden = new Tijd[AANTAL];
        uren = new int[24];
        for (int i = 0; i < uren.length; i++) {
            uren[i] = i + 1;
        }
    }

    public void genereerBezoekersTijden() {
        for (int i = 0; i < AANTAL; i++) {
            Tijd nTijd = new Tijd();
            nTijd.maakRandomTijd();
            this.tijden[i] = nTijd;
        }
    }

    public int getControleTotaal() {
        int som = 0;
        for (int value : uren) {
            som += value;
        }
        return som;
    }

    public int[] getUren() {
        return uren;
    }

    public String laatste() {
        return "ok";
    }

    public void toonVerdeling() {
        for (int i = 0; i < uren.length; i++) {
            System.out.println("Uur " + i + ": " + uren[i]);
        }
    }

    public void voegBezoekersTijdenToe() {
        for (int i = 0; i < AANTAL; i++) {
            for (int j = 0; j < this.uren.length; j++) {
                if (this.tijden[i].getUren() == j) {
                    this.uren[j]++;
                }
            }
        }
    }

    public String vroegste() {
        int vroegste = Integer.MAX_VALUE;
        for (int i = 0; i < AANTAL; i++) {
            if (this.tijden[i].toInteger() < vroegste) {
                vroegste = this.tijden[i].toInteger();
            }
        }
        return String.valueOf(vroegste);
    }


}
