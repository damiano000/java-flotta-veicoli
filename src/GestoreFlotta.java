import java.util.ArrayList;

// Definizione della classe "GestoreFlotta"
public class GestoreFlotta {

    ArrayList<Veicolo> veicoli = new ArrayList<>();

    // Metodo per aggiungere un veicolo all'ArrayList "veicoli"
    public void addVeicolo(Veicolo veicolo) {
        veicoli.add(veicolo);
    }

    // Metodo per conteggiare i veicoli di tipo "Automobile" o "Motocicletta" presenti nella flotta
    public int conteggioVeicoli(int sceltaTipo) {
        int c = 0;
        if (sceltaTipo == 1) { // Automobile
            for (Veicolo veicolo : veicoli) {
                if (veicolo instanceof Automobile) {
                    c++;
                }
            }
        } else if (sceltaTipo == 2) { // Motocicletta
            for (Veicolo veicolo : veicoli) {
                if (veicolo instanceof Motocicletta) {
                    c++;
                }
            }
        }
        return c;
    }

    // Metodo per trovare un veicolo nella flotta in base alla targa
    public Veicolo trovaVeicolo(String targa) {
        for (Veicolo veicolo : veicoli) {
            if (veicolo.getTarga().equalsIgnoreCase(targa)) {
                return veicolo;
            }
        }
        return null;
    }
}
