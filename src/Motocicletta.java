// Definizione della classe "Motocicletta" che estende la classe "Veicolo"
class Motocicletta extends Veicolo {
    private boolean cavalletto;

    public Motocicletta(String targa, int annoImmatricolazione) {
        super(targa, annoImmatricolazione);
    }

    public boolean getCavalletto() {
        return cavalletto;
    }

    public void setCavalletto(boolean cavalletto) {
        this.cavalletto = cavalletto;
    }
}