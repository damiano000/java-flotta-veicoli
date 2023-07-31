import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestoreFlotta gestore = new GestoreFlotta();
        System.out.println("Benvenuto");

        while (true) {

            System.out.println(" Seleziona un'opzione:");
            System.out.println("1 - Aggiungi un'automobile");
            System.out.println("2 - Aggiungi una motocicletta");
            System.out.println("3 - Conteggio veicoli per tipo");
            System.out.println("4 - Trova veicolo per targa");

            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci targa auto:");
                    String targaAuto = scanner.next();
                    System.out.println("Inserisci l'anno di immatricolazione:");
                    int annoAuto = scanner.nextInt();
                    System.out.println("Inserisci il numero di porte:");
                    int numPorte = scanner.nextInt();
                    Automobile auto = new Automobile(targaAuto, annoAuto);
                    auto.setNumeroPorte(numPorte);
                    gestore.addVeicolo(auto);
                    break;

                case 2:
                    System.out.println("Inserisci targa della motocicletta:");
                    String targaMoto = scanner.next();
                    System.out.println("Inserisci l'anno di immatricolazione:");
                    int annoMoto = scanner.nextInt();
                    System.out.println("La motocicletta ha il cavalletto? (true/false):");
                    boolean cavalletto = scanner.nextBoolean();
                    Motocicletta moto = new Motocicletta(targaMoto, annoMoto);
                    moto.setCavalletto(cavalletto);
                    gestore.addVeicolo(moto);
                    break;

                case 3:
                    System.out.println("Quale veicolo vuoi selezionare?");
                    System.out.println("1 - Automobile");
                    System.out.println("2 - Motocicletta");
                    int sceltaTipo = scanner.nextInt();
                    int conteggio = gestore.conteggioVeicoli(sceltaTipo);
                    System.out.println("Numero di veicoli del tipo selezionato: " + conteggio);
                    break;

                case 4:
                    System.out.println("Inserisci la targa del veicolo:");
                    String targa = scanner.next();
                    Veicolo veicoloTrovato = gestore.trovaVeicolo(targa);
                    if (veicoloTrovato != null) {
                        System.out.println("Veicolo trovato: " + veicoloTrovato.getClass().getSimpleName());
                    } else {
                        System.out.println("Nessun veicolo trovato con la targa specificata.");
                    }
                    break;

                default:
                    System.out.println("Scelta non valida.");
                    break;
            }
        }
    }
}