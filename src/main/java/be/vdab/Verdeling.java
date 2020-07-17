package be.vdab;

import be.vdab.Tijd;

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

    public void genereerBezoekersTijden(){

    }

   public int getControleTotaal(){

   }

    public int[] getUren() {
        return uren;
    }

    public String laatste(){

    }

    public String toonVerdeling(){

    }

    public void voegBezoekersTijdenToe(){

    }

    public String vroegste(){

    }


}
