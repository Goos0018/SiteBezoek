package be.vdab;

public class TestSiteBezoek {

    public static void main(String[] args) {

        Verdeling verdeling = new Verdeling();
        verdeling.genereerBezoekersTijden();
        verdeling.voegBezoekersTijdenToe();

        System.out.println("Verdeling:");
        verdeling.toonVerdeling();

        System.out.println("Totaal aantal bezoekers: " + verdeling.getControleTotaal());
        System.out.printf("Eerste om %-12s\n", verdeling.vroegste());
        System.out.printf("Laatste om %-11s\n ", verdeling.laatste());
    }
}
