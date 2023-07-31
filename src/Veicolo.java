// Definizione della classe base "Veicolo"
   public class Veicolo {

    private String targa;
    private int annoImmatricolazione;

    // Costruttore per la classe Veicolo con parametri "targa" e "annoImmatricolazione"
    public Veicolo (String targa, int annoImmatricolazione) {
        this.targa = targa;
        this.annoImmatricolazione = annoImmatricolazione;
    }

    public Veicolo() {
        return;
    }
    // Metodo getter per ottenere la targa del veicolo
    public String getTarga() {
        return targa;
    }

    // Metodo getter per ottenere l'anno di immatricolazione del veicolo
    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }
}
