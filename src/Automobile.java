// Definizione della classe "Automobile" che estende la classe "Veicolo"
class Automobile extends Veicolo {
    private int numeroPorte;

    public Automobile(String targa, int annoImmatricolazione) {
        super(targa, annoImmatricolazione);
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }
}